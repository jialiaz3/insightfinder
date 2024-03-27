import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class MessageSearcher {
    private static final List<String> messages = new ArrayList<>();
    private static int searchCount = 0;
    private static int totalMatches = 0;

    public static void main(String[] args) throws IOException {
        // Load messages from files specified in args
        for (String filename : args) {
            Path filePath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filePath);
            messages.addAll(lines);
        }

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter a word to search (-1 to exit): ");
                String input = scanner.nextLine();
                if ("-1".equals(input)) {
                    break;
                }
                searchAndDisplayMessages(input);
            }
        }

        // Display summary
        System.out.println("Program exited.");
        System.out.println("Total searches performed: " + searchCount);
        System.out.println("Total words matched: " + totalMatches);
    }

    private static void searchAndDisplayMessages(String word) {
        searchCount++;
        int matchesInSearch = 0;

        for (String message : messages) {
            if (message.toLowerCase().contains(word.toLowerCase())) {
                System.out.println(highlightWordInMessage(message, word));
                matchesInSearch++;
            }
        }

        totalMatches += matchesInSearch;
        if (matchesInSearch == 0) {
            System.out.println("No matches found.");
        }
    }

    private static String highlightWordInMessage(String message, String word) {
        return message.replaceAll("(?i)" + word, word.toUpperCase());
    }
}

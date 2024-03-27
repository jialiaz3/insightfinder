# Message Searcher Program

The Message Searcher is a Java program that reads messages from multiple input files, where each message is separated by 
a newline. It provides a command-line interface for users to search for words within these messages. Found words 
are highlighted in uppercase in the output.

## Features

- Reads messages from multiple input files.
- Search for words across all messages.
- Highlight matching words in uppercase.
- Command-line interface for easy interaction.
- Summary information on exit, including total searches and matches.

## Prerequisites

- Java Development Kit (JDK) 8 or higher.

## How to Run
1. First, cd to the src folder in terminal

2. Compile the program:

```bash
javac MessageSearcher.java
```
3. Package into a JAR file:
```bash
jar cfe MessageSearcher.jar MessageSearcher MessageSearcher.class
```
4. Run the program with input files as arguments:

```bash
java -jar MessageSearcher.jar ../test_files/inputFile1.txt ../test_files/inputFile2.txt
```
Note: I created two sample test files in test_files folder, please feel free to 
replace /test_files/inputFile1.txt and 
/test_files/inputFile2.txt with the actual paths to your input files.
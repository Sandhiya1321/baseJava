package internTasks;
import java.io.*;
import java.util.Scanner;

public class fileDecryptEncrypt {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Choose an option: \n1. Encrypt\n2. Decrypt");
                int choice = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter file name (with path): ");
                String inputFile = scanner.nextLine();
                System.out.print("Enter output file name: ");
                String outputFile = scanner.nextLine();
                int shift = 3;
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                    BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
                    String line;

                    while ((line = reader.readLine()) != null) {
                        String processedLine = (choice == 1) ? encrypt(line, shift) : decrypt(line, shift);
                        writer.write(processedLine);
                        writer.newLine();
                    }

                    reader.close();
                    writer.close();
                    System.out.println("Operation successful. Check the output file.");
                } catch (IOException e) {
                    System.out.println("Error processing file: " + e.getMessage());
                }
            }

            public static String encrypt(String text, int shift) {
                StringBuilder result = new StringBuilder();
                for (char ch : text.toCharArray()) {
                    if (Character.isLetter(ch)) {
                        char base = Character.isUpperCase(ch) ? 'A' : 'a';
                        result.append((char) ((ch - base + shift) % 26 + base));
                    } else {
                        result.append(ch);
                    }
                }
                return result.toString();
            }
            public static String decrypt(String text, int shift) {
                 return encrypt(text, 26 - shift);
    }
}

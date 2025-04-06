import java.io.*;

public class SimpleFileHandler {
    public static void main(String[] args) {
        String filePath = "example.txt";
        writeToFile(filePath, "Hello, this is a simple text file.\nThis is the second line.");
        readFromFile(filePath);
    }

    static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    static void readFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Reading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file.");
        }
    }
}

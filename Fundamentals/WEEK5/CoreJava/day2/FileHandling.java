
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) {
        String fileName = "OutputNotes.txt"; // Specify the path to your output file
        writeBufferToFile(fileName);
        readFromFile(fileName);
    }

    static void readFromFile(String fileName) {
        try (FileReader fr = new FileReader(fileName)) {
            int character;
            while ((character = fr.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

    }

    void readBufferFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    static void writeToFile(String fileName) {
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write("Hello, this is written using FileWriter.\n");
            fw.write("FileWriter writes data character by character.\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    static void writeBufferToFile(String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("Hello, this is written using BufferedWriter.\n");
            bw.write("BufferedWriter writes data in chunks, improving performance.\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

    }

}

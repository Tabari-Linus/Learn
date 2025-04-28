
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToAFile {

    public static void main(String[] args) {

        FileWriter writer = null;
        BufferedWriter bw = null;
        try {
            writer = new FileWriter("OutputNotes.txt", true);
            bw = new BufferedWriter(writer);
            bw.write("Welcome to Java Programming!\n");
            bw.write("This week we are learning about File Handling.\n");
            bw.write("We are writing to a file using BufferedWriter 1.\n");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (writer != null) {
                    writer.close();

                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the file: " + e.getMessage());
            }
        }

    }
}

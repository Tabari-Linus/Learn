
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {

    public static void main(String[] args) {

        FileReader reader = null;
        try {
            reader = new FileReader("./Notes.txt");
            BufferedReader br = new BufferedReader(reader);

            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing file: " + ex.getMessage());
            }
        }

    }
}

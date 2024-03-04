import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TheFileWriter {
    public static void main(String[] args) {
        String content = "Hello, this is a sample file.";

        try {
            File file = new File("sample.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();
            System.out.println("Successfully wrote 'Hello' to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

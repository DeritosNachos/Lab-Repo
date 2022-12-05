package Chapter1._3_FileIO.WritingToFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    /**
     * This is a research problem!
     * Similarly to reading from a file, you will need to research how to write to a file as well.
     * The test cases will clear the file before every test and check that the file contains text.
     *
     * @param filepath the file path to be written to (in src/main/resources/Files).
     * @param text the text to be written to a file.
     */
    public void write(String filepath, String text) throws IOException {
        FileWriter myWriter = new FileWriter(filepath);
        myWriter.write(text);
        myWriter.close();

    }
}

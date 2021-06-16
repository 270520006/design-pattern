import java.io.*;

public class ReaderFactory {
    public static Reader getBufferedReader() throws FileNotFoundException {
        File file = new File("aa.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        return reader;
    }
}

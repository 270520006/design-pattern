import java.io.FileNotFoundException;
import java.io.Reader;

public class TestFactory {
    public static void main(String[] args) throws FileNotFoundException {
        Reader bufferedReader = ReaderFactory.getBufferedReader();
        System.out.println(bufferedReader);
    }
}

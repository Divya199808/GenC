import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("log.txt"));
        for (String line; (line = br.readLine()) != null;) {
            System.out.print(line);
        }
        br.close();
    }
}

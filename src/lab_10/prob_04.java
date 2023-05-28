package lab_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class prob_04 {

    public static void main(String[] args) {
        try {
            FileReader in = new FileReader(new File("test.txt"));
            StreamTokenizer str = new StreamTokenizer(in);
            int i = 0;

            while(str.nextToken() != -1) {
                if (str.ttype == -3) {
                    ++i;
                }
            }

            System.out.println("In fisier sunt " + i + " de cuvinte");
        } catch (FileNotFoundException var4) {
            var4.printStackTrace();
        } catch (IOException var5) {
            var5.printStackTrace();
        }

    }
}

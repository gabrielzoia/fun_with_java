package lab_08;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class prob_02 {
    public static void main(String[] args) {
        File file = new File("C:\\demo\\file.txt");
        cat(file);
    }

    public static void cat(File file) {
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");

            while((line = input.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException var7) {
            System.out.println("A aparut o eroare");
            System.out.println("Eroare: " + var7);
        } finally {
            ;
        }
    }
}

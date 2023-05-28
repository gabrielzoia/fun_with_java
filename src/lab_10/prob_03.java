package lab_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class prob_03 {

    public static void main(String[] args) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("test.txt"));
            new String();
            Scanner sc = new Scanner(System.in);

            String line;
            while(!(line = sc.nextLine()).equals("exit")) {
                out.write(line + '\n');
            }

            out.close();
            BufferedReader in = new BufferedReader(new FileReader("test.txt"));

            while((line = in.readLine()) != null) {
                System.out.println(line);
            }

            in.close();
            sc.close();
        } catch (FileNotFoundException var5) {
            var5.printStackTrace();
        } catch (IOException var6) {
            var6.printStackTrace();
        }

    }
}

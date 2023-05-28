package lab_08;

import java.util.Scanner;

public class prob_03 {

    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();
        word = word.toUpperCase();

        int i;
        for(i = 0; i < word.length(); ++i) {
            try {
                ++counts[word.charAt(i) - 65];
            } catch (ArrayIndexOutOfBoundsException var6) {
                System.out.println("\"" + word.charAt(i) + "\"" + " is not a letter");
            }
        }

        System.out.println("The following letters appear in the entered word : ");

        for(i = 0; i < counts.length; ++i) {
            if (counts[i] != 0) {
                System.out.println((char)(i + 65) + ": " + counts[i]);
            }
        }

        scan.close();
    }
}

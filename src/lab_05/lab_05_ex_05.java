package lab_05;

import java.util.Scanner;

public class lab_05_ex_05 {
    public static void msg() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        System.out.println("Enter the substring to replace:");
        String oldSubStr = sc.nextLine();

        System.out.println("Enter the new string:");
        String newStr = sc.nextLine();

        String newSentence = sentence.replace(oldSubStr, newStr);

        System.out.println("Old sentence: " + sentence);
        System.out.println("New sentence: " + newSentence);
    }
}

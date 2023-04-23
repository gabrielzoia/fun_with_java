package lab_05;

import java.util.Scanner;
public class lab_05_ex_02 {
    public static void msg() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = sc.nextLine();

        String[] words = inputString.split(" ");
        String shortestWord = words[0];
        String longestWord = words[0];

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < shortestWord.length()) {
                shortestWord = words[i];
            }
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        System.out.println("The shortest word is: " + shortestWord);
        System.out.println("The longest word is: " + longestWord);
    }
}

package lab_05;

import java.util.Arrays;
import java.util.Scanner;

public class lab_05_ex_03 {
    public static void msg() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
        } else {
            char[] str1Array = str1.toLowerCase().toCharArray();
            char[] str2Array = str2.toLowerCase().toCharArray();

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            boolean areEqual = Arrays.equals(str1Array, str2Array);

            if (areEqual) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }
    }
}

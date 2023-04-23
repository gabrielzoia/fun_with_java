package lab_05;

import java.util.Scanner;

public class lab_05_ex_04 {
    public static void msg() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer("example.com");

        boolean result = str.equals(sb.toString());

        System.out.println("Comparing " + str + " and " + sb + ": " + result);
    }
}

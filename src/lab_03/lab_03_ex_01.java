package lab_03;

import java.util.Scanner;

public class lab_03_ex_01 {
    public static void msg() {
        int number;

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get number from the user.
        System.out.print("Please enter the number ");
        number = console.nextInt();

        System.out.println(number >= 0 ? "Number is positive" : "Number is negative");
    }
}

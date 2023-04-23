package lab_02;

import java.util.Scanner;

public class lab_02_ex_05 {
    public static void msg() {
        int number;
        String show_split_number = "";

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get number from the user.
        System.out.print("Please enter the number ");
        number = console.nextInt();

        while (number > 0) {
            show_split_number += " " + number % 10;
            number /= 10;
        }

        StringBuilder show_result = new StringBuilder(show_split_number);

        System.out.println(show_result.reverse());
    }
}

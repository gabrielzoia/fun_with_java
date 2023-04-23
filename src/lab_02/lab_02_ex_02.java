package lab_02;

import java.util.Scanner;

public class lab_02_ex_02 {
    public static void msg() {
        int number;
        int sum = 0;
        int get_num;

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get number from the user.
        System.out.print("Please enter a number ");
        number = console.nextInt();

        // Display sum
        get_num = number;
        while (get_num > 0) {
            sum += get_num % 10;
            get_num /= 10;
        }

        System.out.println("The sum of all digits in " + number + " is " + sum);
    }
}

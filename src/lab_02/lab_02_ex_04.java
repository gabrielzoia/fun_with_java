package lab_02;

import java.util.Scanner;

public class lab_02_ex_04 {
    public static void msg() {
        int number_1;
        int number_2;

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get number from the user.
        System.out.print("Please enter the first number ");
        number_1 = console.nextInt();

        System.out.print("Please enter the second number ");
        number_2 = console.nextInt();

        System.out.println("Sum: " + (number_1 + number_2) + "\n");
        System.out.println("Difference: " + (number_1 - number_2) + "\n");
        System.out.println("Product: " + (number_1 * number_2) + "\n");
        System.out.println("Average: " + ((number_1 + number_2) / 2) + "\n");
        System.out.println("The distance for the first number: " + Math.abs(number_1) + "\n");
        System.out.println("The distance for the second number: " + Math.abs(number_2) + "\n");
        System.out.println("The maximum: " + (number_1 > number_2 ? number_1 : number_2) + "\n");
        System.out.println("The minimum: " + (number_1 < number_2 ? number_1 : number_2) + "\n");
    }
}

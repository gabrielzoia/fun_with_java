package lab_02;

import java.util.Scanner;

public class lab_02_ex_03 {
    public static void msg() {
        float number;

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get number from the user.
        System.out.print("Please enter a number ");
        number = console.nextInt();

        System.out.println("Square: " + number * number + "\n");
        System.out.println("Cube: " + number * number * number + "\n");
        System.out.println("Fourth power: " + number * number * number * number + "\n");

    }
}

package lab_03;

import java.util.Scanner;

public class lab_03_ex_04 {
    public static void msg() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sumOfEvenDigits = 0;
        int sumOfOddDigits = 0;

        while (number != 0) {
            int digit = number % 10;

            // Check if the digit is even or odd
            if (digit % 2 == 0) {
                sumOfEvenDigits += digit;
            } else {
                sumOfOddDigits += digit;
            }

            number /= 10;
        }

        System.out.println("Sum of even digits: " + sumOfEvenDigits);
        System.out.println("Sum of odd digits: " + sumOfOddDigits);
    }
}

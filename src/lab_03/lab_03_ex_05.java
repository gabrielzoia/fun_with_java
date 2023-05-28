package lab_03;

import java.util.Scanner;

public class lab_03_ex_05 {
    public static void msg() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        switch (age) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("You are not eligible to vote in Romania.");
                break;

            default:
                System.out.println("You are eligible to vote in Romania.");
                break;
        }
    }
}

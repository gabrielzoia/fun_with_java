package lab_08;

import java.util.Scanner;

public class prob_04 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());

        while(scanLine.hasNext()) {
            try {
                int val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException var7) {
            }
        }

        System.out.println("The sum of the integers on this line is " + sum);
    }
}

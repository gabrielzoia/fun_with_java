package lab_03;

import java.util.Scanner;

public class lab_03_ex_03 {
    public static void msg() {
        int i, j;
        boolean isPrime;

        for (i = 1; i <= 100; i++) {
            isPrime = true;

            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}

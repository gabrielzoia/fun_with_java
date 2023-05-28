package lab_04;

import java.util.Scanner;

public class lab_04_ex_03 {
    public static void msg() {
        Scanner scanner = new Scanner(System.in);

        // Number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create the array
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Remove the duplicate elements
        int uniqueElements = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueElements; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                array[uniqueElements] = array[i];
                uniqueElements++;
            }
        }

        // Print out
        System.out.println("The array with duplicate elements removed is:");
        for (int i = 0; i < uniqueElements; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("The length of the new array is: " + uniqueElements);
    }
}

package lab_05;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.security.MessageDigest;

public class lab_05_ex_01 {
    public static void msg() throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (password.length() < 8) {
            System.out.println("Invalid password: Password must be at least 8 characters long.");
            System.exit(0);
        } else if (password.contains(" ")) {
            System.out.println("Invalid password: Password must not contain any spaces.");
            System.exit(0);
        } else if (!Character.isUpperCase(password.charAt(0))) {
            System.out.println("Invalid password: Password must begin with an uppercase letter.");
            System.exit(0);
        } else if (!password.matches(".*[#$%].*")) {
            System.out.println("Invalid password: Password must contain at least a special character.");
            System.exit(0);
        } else {
            System.out.println("Valid password.");
        }

        // Encrypt it using SHA-256
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        String encryptedPassword = bytesToHex(digest);
        System.out.println("Your encrypted password is: " + encryptedPassword);
    }

    public static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}

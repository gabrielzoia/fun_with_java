package lab_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

public class lab_03_ex_02 {
    public static void msg() throws ParseException {
        int number;
        Date date;
        Calendar calendar = Calendar.getInstance();

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get number from the user.
        System.out.print("Please enter the number: ");
        number = console.nextInt();

        getDay(number);

        System.out.print("Please enter the date: ");
        date = new SimpleDateFormat("dd.MM.yyyy").parse(String.valueOf(console.next()));
        calendar.setTime(date);

        getDay(calendar.get(Calendar.DAY_OF_WEEK));
    }

    public static void getDay(int number) {
        System.out.println(
                number == 1 ? "Monday" :
                number == 2 ? "Tuesday" :
                        number == 3 ? "Wednesday" :
                                number == 4 ? "Thursday" :
                                        number == 5 ? "Friday" :
                                                number == 6 ? "Saturday" :
                                                        number == 7 ? "Sunday" : null);
    }
}

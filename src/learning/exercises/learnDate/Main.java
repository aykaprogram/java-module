package learning.exercises.learnDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();

            System.out.println(findDay(month, day, year));

    }

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");

        return sdf.format(calendar.getTime()).toUpperCase();



    }

}


package dataHandling;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CountOfTime {
    public static void countOfTime() {
        Calendar calendar = new GregorianCalendar(1995, 0, 10);
        Date today = new Date();
        Date date = calendar.getTime();
        System.out.println((today.getTime() - date.getTime()) / 1000 + " seconds");
        System.out.println((today.getTime() - date.getTime()) / 1000 / 60 + " minutes");
        System.out.println((today.getTime() - date.getTime()) / 1000 / 60 / 60 + " hours");
        System.out.println((today.getTime() - date.getTime()) / 1000 / 60 / 60 / 24 + " days");
        System.out.println((today.getTime() - date.getTime()) / 1000 / 60 / 60 / 24 / 30 + " months");
        System.out.println((today.getTime() - date.getTime()) / 1000 / 60 / 60 / 24 / 30 / 12 + " years");
    }
}

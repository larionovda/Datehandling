package dataHandling;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class FormatterDate {
    public static void formaterDate(){

        String strDate = "Aug 10, 2016 12:10:56 PM";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("LLL dd, yyyy hh:mm:ss a");
        LocalDateTime date = LocalDateTime.parse(strDate, formatter);
        System.out.println(date);

        String goodFriday = "Apr 18 2014";
        try {
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMM dd yyyy");
            LocalDate holiday = LocalDate.parse(goodFriday, formatter2);
            System.out.printf("Successfully parsed String %s, date is %s%n", goodFriday, holiday);
        } catch (DateTimeParseException ex) {
            System.out.printf("%s is not parsable!%n", goodFriday);
            ex.printStackTrace();
        }
    }
}

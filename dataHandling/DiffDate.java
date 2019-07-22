package dataHandling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Math.abs;

public class DiffDate {
    public static void diffDate() throws ParseException {
        String strDate = "11.18.1903";
        String strDate2 = "21.18.1903";
        Date parseDate = new SimpleDateFormat("dd.MM.yyyy").parse(strDate);
        Date parseDate2 = new SimpleDateFormat("dd.MM.yyyy").parse(strDate2);
        System.out.println(abs((parseDate.getTime() - parseDate2.getTime()) / 1000 / 60 / 60 / 24));
    }
}

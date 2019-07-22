package dataHandling;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        try {
            ServiceRun.run();
        } catch (ParseException e) {
            System.out.println("ParseException from class DiffDate");
        }
    }
}

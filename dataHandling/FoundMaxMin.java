package dataHandling;

import static java.lang.Float.max;
import static java.lang.Float.min;

public class FoundMaxMin {
    public static void foundMaxMin(int a, int b, int c) {
        System.out.println("Max number is " + max(max(a, b), c));
        System.out.println("Min number is " + min(min(a, b), c));
    }
}

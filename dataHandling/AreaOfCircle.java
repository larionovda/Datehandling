package dataHandling;

import java.math.BigDecimal;
import java.math.MathContext;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class AreaOfCircle {
    public static void areaOfCircle(){
        int radius = 10;
        MathContext mc = new MathContext(100);
        BigDecimal a = new BigDecimal(pow(radius, 2));
        BigDecimal p = new BigDecimal(PI);
        System.out.printf("%.50f", a.multiply(p, mc) );
    }
}

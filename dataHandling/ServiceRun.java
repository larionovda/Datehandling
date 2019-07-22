package dataHandling;

import java.text.ParseException;

public class ServiceRun {
    public static void run() throws ParseException {
        CountOfTime.countOfTime();
        DiffDate.diffDate();
        FormatterDate.formaterDate();
        AreaOfCircle.areaOfCircle();
        System.out.println(CheckEqualDouble.checkEqualDouble());
        FoundMaxMin.foundMaxMin(3, 4, 5);
        RepeatEnd.repeatEnd("sdf", 2);
        BobTheir.bobThere("sdf");
        CountCode.countCode("qwertyu");
    }
}

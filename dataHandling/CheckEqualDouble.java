package dataHandling;

public class CheckEqualDouble {
    public static boolean checkEqualDouble() {
        String str = "0.1";
        String str2 = "0.15";
        String str3 = "0.25";
        return (Double.parseDouble(str) + Double.parseDouble(str2) == Double.parseDouble(str3));

    }
}

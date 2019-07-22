package dataHandling;

public class RepeatEnd {
    public static String repeatEnd(String str, int n){
        String resultStr = "";
        for (int i = 0; i < n; i++){
            resultStr += str.substring(str.length() - n);
        }
        return resultStr;
    }
}

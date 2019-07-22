package dataHandling;

public class DoubleCHar {
    public static String doubleChar(String str){
        String resultStr = "";
        char[] charString = str.toCharArray();
        for (int i = 0; i < charString.length; i++){
            resultStr += charString[i];
            resultStr += charString[i];
        }
        return resultStr;
    }
}

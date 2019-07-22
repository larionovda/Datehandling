package dataHandling;

public class BobTheir {
    public static boolean bobThere(String str) {
        String resultStr = "";
        char[] bobChar = str.toCharArray();
        for (int i = 0; i < bobChar.length; i++) {
            if ('b' == bobChar[i] && resultStr.length() == 2) {
                return true;
            } else if ('b' == bobChar[i]) {
                resultStr += bobChar[i];
            } else if ("b".equals(resultStr)) {
                resultStr += bobChar[i];
            } else if (resultStr.length() == 2) {
                resultStr = "";
            }
        }
        return false;
    }
}

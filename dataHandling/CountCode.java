package dataHandling;

public class CountCode {
    public static int countCode(String str) {
        int count = 0;
        String countStr = "";
        char[] charStr = str.toCharArray();
        for (int i = 0; i < charStr.length; i++) {
            if ("co".equals(countStr)) {
                countStr += charStr[i];
            } else if (charStr[i] == 'c') {
                if ("c".equals(countStr) || countStr.length() == 3) {
                    continue;
                } else {
                    countStr += charStr[i];
                }
            } else if (charStr[i] == 'o') {
                if (countStr.length() == 3) {
                    countStr = "co";
                    continue;
                } else {
                    countStr += charStr[i];
                }
            } else if (countStr.length() == 3 && charStr[i] == 'e') {
                count++;
                countStr = "";
            } else if (countStr.length() == 3 && charStr[i] != 'e'){
                countStr = "";
            }
        }
        return count;
    }
}

package string;

public class IntToString {
    public static void main(String[] args) {
        int i = 123;
        String s = itoa(i);
        System.out.println(s);
    }
    
    public static String itoa(int i) {
        String str = "";
        boolean isNeg = false;
        if (i < 0) {
            i = Math.abs(i);
            isNeg = true;
        }
        while (i > 0) {
            int remainder = i % 10;
            str = remainder + str;
            i /= 10;
        }
        /*String finalstr = "";
        for (int a = str.length() - 1; a >= 0; a--) {
            finalstr += str.substring(a, a+1);
        }*/

        return isNeg ?  "-" + str : str;
    }
}


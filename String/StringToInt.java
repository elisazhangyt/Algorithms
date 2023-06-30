package string;

public class StringToInt {
    public static void main(String[] args) {
        String s = "-123";
        int i = atoi(s);
        System.out.println(i);
    }
    
    public static int atoi(String s) {
        boolean isNeg = false;
        if (s.charAt(0) == '-') {
            isNeg = true;
            s = s.substring(1);
        }
        int i = 0;
        int index = s.length() - 1;
        int p = 0;
        while (index >= 0) {
            char c = s.charAt(index);
            i += (c - '0') * Math.pow(10,p);
            index--;
            p++;
        }
        return isNeg ? i * -1 : i;
    }
}

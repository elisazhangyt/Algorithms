package string;

public class ReverseString {
    public static void main(String[] args) {
        /*char[] arr = {'a', 'b', 'c'};
        reverse1(arr);
        for (char element : arr) {
            System.out.println(element);
        }*/
        String s = "abc";
        String s2 = reverse2(s);
        System.out.println(s2);
        
        
    }
    
        public static void reverse1(char[] c) {
            /*int middle = (c.length + 1) / 2 - 1;
            for (int i = 0; i <= middle; i++) {
                int endindex = c.length - 1 - i;
                char temp = c[i];
                c[i] = c[endindex];
                c[endindex] = temp;
            }*/
            
            int left = 0;
            int right = c.length - 1;
            while (left < right) {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }
        }
        
        public static String reverse2(String s) {
            String str = "";
            if (s.length() == 1){
                return s;
            }
            str = reverse2(s.substring(1)) + s.substring(0,1);
            return str;
        }
}

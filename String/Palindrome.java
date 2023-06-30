// Valid Palindrome: https://leetcode.com/problems/valid-palindrome/

    // Two indexes:
    static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (! Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (! Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (! (s.charAt(i) == s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
// Valid Anagram: https://leetcode.com/problems/valid-anagram/description/
    
    // Two indexes:
    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        for (int sIndex = 0; sIndex < s.length(); sIndex++) {
            int tIndex = t.indexOf(s.charAt(sIndex));
            if (tIndex == -1) {
                return false;
            }
            t = t.substring(0, tIndex) + t.substring(tIndex + 1);
        }
        return true;
    }

    // Counting sort:
    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arrS = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arrS[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            arrS[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arrS[i] != 0) {
                return false;
            }
        }
        return true;
    }


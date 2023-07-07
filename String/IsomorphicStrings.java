// Isomorphic Strings: https://leetcode.com/problems/isomorphic-strings/

import java.util.*;

public class IsomorphicStrings {
    static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Character> h = new HashMap<Character, Character>();
        HashSet<Character> h2 = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);
            if (h.get(c1) == null) {
                if (h2.contains(c2)) {
                    return false;
                }
                h.put(c1, c2);
                h2.add(c2);
            } else {
                if (! c2.equals(h.get(c1))) {
                    return false;
                }
            }
        }
        return true;
    }
}


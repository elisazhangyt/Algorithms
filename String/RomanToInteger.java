// Roman To Integer: https://leetcode.com/problems/roman-to-integer/

import java.util.*;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> h = new HashMap<Character, Integer>();
        h.put('I', 1);
        h.put('V', 5);
        h.put('X', 10);
        h.put('L',50);
        h.put('C', 100);
        h.put('D', 500);
        h.put('M', 1000);
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() - 1 && h.get(s.charAt(i)) < h.get(s.charAt(i+1))) {
                total -= h.get(s.charAt(i));
            } else {
                total += h.get(s.charAt(i));
            }
        }
        return total;
    }
}


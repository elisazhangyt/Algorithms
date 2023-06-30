// Valid Parentheses: https://leetcode.com/problems/valid-parentheses/

import java.util.Stack;

public class ValidParentheses {
    static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '(' || curr == '{' || curr == '[') {
                st.push(curr);
            } else if (st.isEmpty()) {
                return false;
            } else {
                Character popped = st.pop();
                if ((curr == ')' && popped != '(') ||
                    (curr == '}' && popped != '{') ||
                    (curr ==']' && popped != '[')) {
                    return false;
                }
            }
        }
        return st.size() == 0;
    }
}


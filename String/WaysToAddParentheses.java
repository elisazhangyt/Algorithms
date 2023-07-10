// Different Ways to Add Parentheses: https://leetcode.com/problems/different-ways-to-add-parentheses/description/

import java.util.*;

public class WaysToAddParentheses {
    static List<Integer> diffWaysToCompute(String expression) {
        List<Integer> finalList = new ArrayList<Integer>();
        if (expression.length() == 1 || expression.length() == 2) {
            finalList.add(Integer.parseInt(expression));
        } else {
            for (int i = 0; i < expression.length(); i++) {
            char operator = expression.charAt(i);
            if (operator == '+' || operator == '-' || operator == '*') {
                List<Integer> leftList = diffWaysToCompute(expression.substring(0, i));
                List<Integer> rightList = diffWaysToCompute(expression.substring(i + 1));
                for (Integer l : leftList) {
                    for (Integer r : rightList) {
                        finalList.add(compute(l, operator, r));
                    }
                }
            }
            }
        }
        return finalList;
    }
    
    static int compute (Integer left, char op, Integer right) {
        if (op == '+') {
            return left + right;
        } else if (op == '-') {
            return left - right;
        } else {
            return left * right;
        }
    }  
}

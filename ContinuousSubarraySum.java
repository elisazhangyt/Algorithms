// Continuous Subarray Sum: https://leetcode.com/problems/continuous-subarray-sum/

import java.util.*;

public class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length < 2) {
            return false;
        }
        HashMap<Integer, Integer> sums = new HashMap<Integer, Integer>();
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            currentSum = currentSum % k;
            if (currentSum == 0 && i > 0) {
                return true;
            }
            if (!sums.containsKey(currentSum)) {
                sums.put(currentSum, i);
            } else {
                if (i - sums.get(currentSum) >= 2) {
                    return true;
                }
            }
        }
        return false;
    } 
}

/*
public boolean checkSubarraySum(int[] nums, int k) {
        int[] sumArray = new int[nums.length + 1];
        int sum = 0;
        sumArray[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sum = sum % k;
            sumArray[i + 1] = sum;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((sumArray[j + 1] - sumArray[i]) % k == 0) {
                    return true;
                }
            }
        }
        return false;
    }
*/

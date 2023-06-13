// Subarray Sum Equals K: https://leetcode.com/problems/subarray-sum-equals-k/

import java.util.*;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> sums = new HashMap<Integer, Integer>();
        sums.put(0, 1);
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (sums.containsKey(currentSum - k)) {
                count += sums.get(currentSum - k);
            }
            /*
            int prevCount;
            if(sums.containsKey(currentSum)) {
                prevCount = sums.get(currentSum);
            } else
                prevCount = 0;
            */
            int prevCount = sums.getOrDefault(currentSum, 0);
            sums.put(currentSum, prevCount + 1);
        }
        return count;
    }
}


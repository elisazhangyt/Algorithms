// Given a target value and array, find if there are two numbers in the array that sum to target

import java.util.Arrays;
import java.util.HashSet;

    // Given sorted array:
    static boolean twoSum(int[] arr, int target) {
        // If not sorted: 
        // Arrays.sort(arr, 0, arr.length);
        int first = 0;
        int second = arr.length - 1;
        while (first < second) {
            int sum = arr[first] + arr[second];
            if (sum == target) {
                return true;
            }
            if (sum < target) {
                first++;
            }
            if (sum > target) {
                second--;
            }
        }
        return false;
    }

    // Given unsorted array:
    static boolean twoSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        int index = 0;
        while (index < arr.length) {
            int diff = target - arr[index];
            if (set.contains(diff)) {
                return true;
            }
            set.add(arr[index++]);
        }
        return false;
    }

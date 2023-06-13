// Sqrt(x) using binary search: https://leetcode.com/problems/sqrtx/

public class SqrtXBinary {
    public int mySqrt(int x) {
        int first = 1;
        int last = x;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (x / mid == mid) {
                return mid;
            } else if (x / mid > mid) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return last;
    }
}

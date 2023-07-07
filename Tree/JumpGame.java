// Jump Game: https://leetcode.com/problems/jump-game/description/

public class JumpGame {
    public boolean canJump(int[] nums) {
    int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums[i]; j++) {
                if (i + j + 1 >= nums.length) {
                    return true;
                }
                arr[i + j + 1] = 1;
            }
            if (arr[i + 1] == 0) {
                return false;
            }
        }
        return true;
    }
}

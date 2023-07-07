// Coin Change: https://leetcode.com/problems/coin-change/

import java.util.*;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {2};
        System.out.println(coinChange(coins, 3));
    }
    
    static int coinChange(int[] coins, int amount) {
        int[] a = new int[amount + 1];
        a[0] = 0;
        for (int i = 1; i <= amount; i++) {
            a[i] = amount + 1;
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0 && a[i - coins[j]] + 1 < a[i]) {
                    a[i] = a[i - coins[j]] + 1;
                }
            }
        }
        
        if (a[amount] == amount + 1) {
            return -1;
        }
        return a[amount];
    }
}


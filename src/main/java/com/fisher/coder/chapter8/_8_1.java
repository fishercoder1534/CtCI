package com.fisher.coder.chapter8;

/**
 * Created by stevesun on 4/16/17.
 */
public class _8_1 {
    /**A child is running up a staircase with n steps, and can hop either 1 step, 2 steps, or 3 steps at a time.
     * Implement a method to count how many possible ways the child can run up the stairs.*/

    public static int ways(int n) {
        if (n < 3) return n;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 3;
        for (int i = 3; i < n; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n-1];
    }
}

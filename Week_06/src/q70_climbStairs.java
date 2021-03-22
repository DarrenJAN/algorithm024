package src;

import java.util.HashMap;

public class q70_climbStairs {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    public int climbStairs(int n) {
        if(n == 1)
            return 1;
        else if(n == 2)
            return 2;
        else if(hashMap.containsKey(n))
            return hashMap.get(n);
        else
        {
            int tmp = climbStairs(n-1) + climbStairs(n-2);
            hashMap.put(n,tmp);
            return tmp;
        }
    }

    //dp 的做法： dp[i] 存的是到i层有多少种做法
    public int climbStairs_dp(int n) {
        if(n== 1) return 1;
        if(n== 2) return 2;

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i<n+1;i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}

package src;

public class q322_coinChange {
    public int coinChange(int[] coins, int amount) {
        if( amount == 0)
            return  0;

        int[] dp = new int[amount+1];
        dp[0] = 0;

        for(int i = 1;i<=amount;i++)
        {
            int local_min = Integer.MAX_VALUE-1;
            for(int j = 0;j<coins.length;j++)
            {
                if(coins[j] > i) continue;

                local_min = Math.min(local_min, 1 + dp[i- coins[j]]);

            }

            dp[i] = local_min;
        }
        return dp[amount] == Integer.MAX_VALUE-1 ? -1: dp[amount];
    }
}

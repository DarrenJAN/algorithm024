
public class q322_coinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0] =0;

        for(int i =1 ;i<amount+1;i++)
        {
            dp[i] = Integer.MAX_VALUE-1;
            for(int j = 0; j<coins.length; j++)
            {
                int coin = coins[j];
                if(coin > i)
                    continue;
                dp[i] = Math.min(dp[i-coin] +1,dp[i] );
            }
        }
        return dp[amount] == Integer.MAX_VALUE-1 ? -1: dp[amount];
    }
}

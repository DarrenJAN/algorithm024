package src;

public class q518_change {
    //这个一定要写在内层
    // 写在内层 是 组合问题
    //https://leetcode-cn.com/problems/coin-change-2/solution/ling-qian-dui-huan-iihe-pa-lou-ti-wen-ti-dao-di-yo/
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        dp[0] = 1;

        for(int j = 0;j<coins.length;j++)
        {
            int cur_coin = coins[j];
            for(int i = 1;i<amount+1;i++)
            {
                if(i < cur_coin)
                    continue;

                dp[i] = dp[i- cur_coin] + dp[i];
            }
        }

        return dp[amount];
    }
}

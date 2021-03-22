package src;

public class q121_maxProfit {

    //暴力解法：
    // 对于每一个
    public int maxProfit(int[] prices) {
        int result = 0;
        for(int i = 0;i<prices.length;i++)
        {
            for(int j = i+1;j< prices.length;j++)
            {
                result = Math.max(result, prices[j] - prices[i]);
            }
        }
        return  result;
    }

    //2.dp
    //dp[i] 目前最大的利润
    public int maxProfit_2(int[] prices) {
        int length = prices.length;
        int[] dp = new int[length];
        dp[0] = 0;
        int min = prices[0];

        for(int i = 1;i<length;i++)
        {
            if(prices[i] <= min)
                dp[i] = dp[i-1];
            else
            {
                dp[i] = Math.max(prices[i] - min, dp[i-1]);
            }

            min = Math.min(min, prices[i]);
        }

        return min;
    }
}

package src;

public class q122_maxProfit_2 {
    public int maxProfit(int[] prices) {
        int result = 0;
        for(int i = 0;i<prices.length;i++)
        {
            if(i > 0)
            {
                if(prices[i]> prices[i-1] )
                    result+= (prices[i] - prices[i-1]);
            }
        }

        return result;
    }
}

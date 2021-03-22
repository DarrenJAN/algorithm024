package src;

import java.util.List;

public class q120_minimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        int result = Integer.MAX_VALUE;
        int row = triangle.size();

        int [][]dp = new int[row][row];
        for(int i =0 ;i<row;i++)
        {
            for(int j = 0;j<i+1;j++)
            {
                //第一排第一个
                if( i == 0)
                    dp[i][j] = triangle.get(i).get(0);
                //每一排第一个
                else if(j == 0)
                {
                    dp[i][j] = dp[i-1][0] + triangle.get(i).get(0);
                }
                //每一排最后一个
                else if(j == i)
                {
                    dp[i][j] = dp[i-1][j-1] + triangle.get(i).get(j);
                }
                //每一排剩下的
                else
                {
                    dp[i][j] = Math.min(dp[i-1][j-1]+ triangle.get(i).get(j), dp[i-1][j]+triangle.get(i).get(j));
                }
            }

        }

        for(int i =0;i<row;i++)
            result = Math.min(result, dp[row-1][i]);

        return result;

    }

    //bottom-up
    public int minimumTotal2(List<List<Integer>> triangle) {
        int length = triangle.size();
        int[] dp = new int[length+1];
        for (int i = length-1;i>=0;i--)
        {
            List<Integer> cur_row = triangle.get(i);
            for(int j = 0;j<cur_row.size();j++)
            {
                dp[j] = Math.min(dp[j], dp[j+1]) + cur_row.get(j);
            }
        }

        return dp[0];
    }

}

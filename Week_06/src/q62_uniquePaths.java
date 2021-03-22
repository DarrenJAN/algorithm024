package src;

public class q62_uniquePaths {
    public int uniquePaths(int m, int n) {
        int row = m;
        int col = n;
        int[][] dp = new int[row+1][col+1];
        for(int i = 1; i<row+1;i++)
        {
            for(int j = 1; j<col+1;j++)
            {
                if(i == 1 && j == 1)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[row][col];

    }
}

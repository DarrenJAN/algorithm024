public class day36_minPathSum {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] dp = new int[row][col];
        dp[0][0] = grid[0][0];

        //第一排
        for(int i = 1; i<col;i++)
        {
            dp[0][i] = dp[0][i-1]+ grid[0][i];
        }

        //第一列
        for(int i =1;i<row;i++)
        {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }

        for(int i= 1;i<row;i++)
        {
            for(int j = 1;j<col;j++)
            {
                dp[i][j] = Math.min(grid[i][j]+dp[i-1][j], grid[i][j]+dp[i][j-1]);
            }
        }
        return dp[row][col];
    }
}

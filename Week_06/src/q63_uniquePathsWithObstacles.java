package src;

public class q63_uniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] dp = new int[row+1][col+1];

        if(obstacleGrid[0][0] == 1)
            return 0;

        for(int i =1;i<row+1;i++)
        {
            for(int j = 1;j<col+1;j++ )
            {
                if(i == 1 && j ==1 )
                    dp[i][j] = 1;
                else if (obstacleGrid[i-1][j-1] != 1)
                {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }

        return dp[row][col];
    }
}

public class day33_longestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int t1_length = text1.length();
        int t2_length = text2.length();

        int[][] dp  = new int[t1_length+1][t2_length+1];


        for(int i =1;i<text1.length();i++)
        {
            for(int j = 1; j<text2.length();j++)
            {
                if(text1.charAt(i) == text2.charAt(j))
                    dp[i][j] = dp[i-1][j-1] +1;
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[t1_length][t2_length];
    }
}

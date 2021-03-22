package src;

public class q72_minDistance {
    public int minDistance(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();

        if(length1 == 0)
            return length2;
        else if(length2 == 0)
            return length1;

        int[][] dp = new int[length1+1][length2+1];

        for(int i= 0;i< length2+1;i++)
            dp[0][i] = i;

        for(int i = 0; i<length1+1; i++)
            dp[i][0] = i;

        for(int i =1; i<length1+1;i++)
        {
            for(int j = 1; j<length2+1; j++)
            {
                if(word1.charAt(i-1) == word2.charAt(j-1))
                {
                    //if the last string character is the same, it equals to dp[i-1][j-1]
                    dp[i][j] = dp[i-1][j-1];
                }else
                {
                    //if we replace the last character, dp[i][j] = dp[i-1][j-1] + 1
                    //if we delete the character in word2, dp[i][j] = dp[i][j-1] + 1
                    //if we insert a the last character in word1, dp[i][j] = dp[i-1[j] +1
                    dp[i][j] = Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1]))+1;
                }
            }
        }

        return dp[length1][length2];
    }

}

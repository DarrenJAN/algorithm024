package src;

public class q91_numDecodings {
    public int numDecodings(String s)  {
        int length = s.length();
        if(length == 0) return 0;
        if(length == 1 && s.charAt(0) == '0')
            return 0;
        if(s.charAt(0) == '0')
            return 0;

        int[] dp = new int[length];
        char[] chars = s.toCharArray();
        dp[0] = 1;

        for(int i = 1;i<length;i++)
        {
            int x = chars[i-1] - '0';
            int y = chars[i] - '0';

            if(y >= 1 && y<= 9)
            {
                dp[i] = dp[i-1];
            }else
            {
                dp[i] = 0;

            }

            int xy = x*10 + y;
            if(xy >=10 && xy<= 26){
                if(i ==1 )
                    dp[i] = dp[i] +1;
                else
                    dp[i] = dp[i] + dp[i-2];
            }
        }

        return dp[length-1];
    }
}

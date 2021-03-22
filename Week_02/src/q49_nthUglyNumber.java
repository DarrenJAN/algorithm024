public class q49_nthUglyNumber {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        int a = 0;
        int b = 0;
        int c = 0;

        dp[0] = 1;

        for(int i = 1;i<n;i++)
        {
            int two = dp[a] *2;
            int three = dp[b] *3;
            int five = dp[c] *5;
            int min = Math.min(two, Math.min(three, five));
            dp[i] = min;

            if(dp[i] == two) a++;
            if(dp[i] == three) b++;
            if(dp[i] == five) c++;

        }
        return dp[n-1];
    }
}

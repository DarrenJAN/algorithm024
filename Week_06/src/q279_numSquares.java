package src;

public class q279_numSquares {
    //跟coin change 那道题很像
    // 12 = 4+ 4+4  （1 + dp[12- 4]）

    public int numSquares(int n) {
        int[] dp = new int[n+1];
        int max_sqrt = (int)Math.sqrt(n);
        int[] square_num = new int[max_sqrt+1];
        for(int i = 1;i<=max_sqrt;i++){
            square_num[i] = i *i;
            //System.out.println(square_num[i]);
        }

        for(int i= 1;i<=n;i++)
        {
            dp[i] = Integer.MAX_VALUE-1;
            for(int j = 1; j<square_num.length;j++)
            {
                int cur_square_num = square_num[j];
                if(cur_square_num> i) continue;

                dp[i] = Math.min(dp[i], dp[i-cur_square_num]+1);
            }
            //System.out.println(dp[i]);
        }

        return dp[n];

    }
}

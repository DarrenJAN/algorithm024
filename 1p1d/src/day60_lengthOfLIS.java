public class day60_lengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        int length = nums.length;
        if(length == 0)
            return 0;

        int[] dp = new int[length];
        dp[0] =0;

        for(int i = 1; i<length;i++)
        {
            dp[i] = dp[i-1];

            for(int j = 0; j<i;j++)
            {
                if( nums[i] > nums[j])
                {
                    dp[i] = Math.max(dp[i], dp[j] +1);
                }
            }
        }

        return dp[length-1];
    }
}

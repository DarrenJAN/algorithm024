package src;

public class q45_jump {
    public int jump(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];

        for(int i = 0;i<length;i++)
        {
            int steps = nums[i];
            int j = i+1;
            while(steps > 0 && j < length)
            {
                if(dp[j] == 0)
                    dp[j] = dp[i]+1;
                else
                    dp[j] = Math.min(dp[i]+1, dp[j]);

                j++;
                steps--;
            }
        }
        return dp[length-1];
    }
}

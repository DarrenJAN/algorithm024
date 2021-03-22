package src;

public class jump {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];

        for(int i = 0 ;i<nums.length;i++)
        {
            int steps =  nums[i];
            int j = i+1;
            while(steps>0 && j<nums.length)
            {
                if(dp[j]== 0)
                    dp[j] = dp[i]+1;
                else
                    dp[j] = Math.min(dp[j], dp[i] + 1 );

                j++;
                steps--;
            }
        }
        return dp[nums.length-1];

    }
}

package src;

public class q198_rob {
    public int rob(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        if(length == 1)
            return nums[0];
        else if(length ==0)
            return 0;
        else if(length ==2)
            return Math.max(nums[0], nums[1]);

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);


        for(int i = 2; i<length;i++)
        {
            dp[i] = Math.max(dp[i-1], dp[i-2]+ nums[i]);
        }

        return dp[length-1];
    }
}

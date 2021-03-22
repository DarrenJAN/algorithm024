package src;

public class q53_maxSubArray {
    //个人觉得最好的dp方法，
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        dp[0] = nums[0];
        int result = dp[0];
        for(int i =1;i<length;i++)
        {
            //这个表示 包括当前数或者不包括
            dp[i] = Math.max(nums[i], nums[i] + dp[i-1]);
            result = Math.max(dp[i], result);
        }
        return result;
    }
}

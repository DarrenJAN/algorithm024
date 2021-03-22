package src;

public class q213_rob {
    public int rob(int[] nums) {
        int length = nums.length;
        if(length == 0)
            return 0;
        else if(length ==1)
            return nums[0];
        else if(length == 2)
            return Math.max(nums[0], nums[1]);

        int[] dp1 = new int[length];
        int[] dp2 = new int[length];
        int[] reverse = nums.clone();
        //reverse the nums
        for(int i = 0;i<length;i++)
        {
            reverse[i] = nums[length-i-1];
        }

        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[0], nums[1]);

        dp2[0] = reverse[0];
        dp2[1] = Math.max(reverse[0], reverse[1]);

        for(int i = 2; i< length-1;i++)
        {
            dp1[i] = Math.max(dp1[i-2] + nums[i], dp1[i-1]);
            dp2[i] = Math.max(dp2[i-2] + reverse[i], dp2[i-1]);
        }

        return Math.max(dp2[length-2], dp1[length-2]);
    }
}

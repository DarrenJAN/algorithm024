public class day32_maxSubArray {
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        if(length == 1)
            return nums[0];

        int result = Integer.MIN_VALUE;
        int local_max = 0;
        for(int i = 0;i<length;i++)
        {
            local_max = Math.max(nums[i], local_max+nums[i]);
            result = Math.max(result, local_max);
        }

        return result;
    }

}

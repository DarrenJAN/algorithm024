package src;

public class q152_maxProduct {
    public int maxProduct(int[] nums) {
        int length = nums.length;
        int[] max = new int[length];
        int[] min = new int[length];

        max[0] = nums[0];
        min[0] = nums[0];
        int result = nums[0];

        for(int i = 1;i<length;i++)
        {
            if(nums[i] > 0)
            {
                max[i] = Math.max(max[i-1] * nums[i], nums[i]);
                min[i] = Math.min(min[i-1] * nums[i], nums[i]);
            }else
            {
                max[i] = Math.max(min[i-1] * nums[i], nums[i]);
                min[i] = Math.min(max[i-1] * nums[i], nums[i]);
            }
            result = Math.max(result, max[i]);
        }


        return result;
    }
}

package src;

public class q55_canJump_2 {
    public boolean canJump(int[] nums) {
        int steps = nums[0];
        for(int i = 0;i<nums.length;i++)
        {
            if(i > steps)
                return false;
            else
                steps= Math.max(steps, i+nums[i]);
        }

        return true;
    }
}

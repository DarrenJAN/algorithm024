package src;

public class q55_canJump {
    public boolean canJump(int[] nums) {
        boolean result = false;
        int maxstep =0;
        for(int i = 0;i<nums.length;i++)
        {
            if(i>maxstep)
                return false;
            else
            {
                maxstep = Math.max(maxstep, i+ nums[i]);
            }
        }
        return true;
    }



}

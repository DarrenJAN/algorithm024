package src;

public class q45_jump_2 {
    public int jump(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        dp[0] = 0;

        for(int i =0 ;i<length;i++)
        {
            int step = nums[i];
            int cur_index = i+1;

            while(step > 0 && cur_index < length )
            {
                if(dp[cur_index] == 0)
                    dp[cur_index] = dp[i] +1;
                else
                    dp[cur_index] = Math.min(dp[cur_index], dp[i]+1);
                //System.out.println(cur_index + " " + dp[cur_index]);

                step--;
                cur_index++;
            }


        }
        return dp[length-1];
    }

}

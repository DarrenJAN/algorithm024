public class day38_rob {
    public int rob(int[] nums) {
        int length = nums.length;

        if(length == 1)
            return nums[0];
        else if(length == 0)
            return 0;
        else if(length == 2)
            return Math.max(nums[0], nums[1]);

        int[] dp1 = new int[length];
        int[] dp2 = new int[length];

        dp1[0] = nums[0]; //包括第一个
        dp2[0] = 0;  //不包括第一个

        dp1[1] = Math.max(nums[0], nums[1]);
        dp2[1] = nums[1];

        dp2[2] = Math.max(nums[1], nums[2]);

        for(int i =2;i<length-1;i++)
        {
            dp1[i] =  Math.max(dp1[i-1], dp1[i-2] + nums[i]);
        }

        for(int i =3; i< length;i++)
        {
            dp2[i] = Math.max(dp2[i-1], dp2[i-2] + nums[i]);
        }

        return Math.max(dp1[length-2], dp2[length-1]);
    }
}

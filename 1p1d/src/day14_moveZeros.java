public class day14_moveZeros {
    //解法：使用双指针的思路，j是指向上一个0的位置
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int j = 0;
        for(int i = 0; i< length; i++)
        {
            if( nums[i] != 0)
            {
                if( i != j)
                {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}

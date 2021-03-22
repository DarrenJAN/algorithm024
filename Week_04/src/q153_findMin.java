package src;

public class q153_findMin {
    //思路就一点 有序里面不可能有最小的(全排序除外)

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        if(nums[left]< nums[right])
            return nums[left];

        while(left < right)
        {
            int mid = left + (right - left)/2;
            if(nums[mid] > nums[right])
                left = mid +1;
            else
                right = mid;

        }
        return nums[left];
    }
}

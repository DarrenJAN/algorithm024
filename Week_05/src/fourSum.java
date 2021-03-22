package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0;i<nums.length-3;i++)
        {
            if(i> 0){
                if(nums[i] == nums[i-1]) continue;
            }

            for(int j = i+1;j<nums.length-2;j++)
            {
                if(j>i+1 && nums[j] == nums[j-1]) continue;

                int left = j+1;
                int right = nums.length-1;
                while(left < right)
                {
                    int first = nums[i];
                    int second = nums[j];
                    int third = nums[left];
                    int fourth = nums[right];

                    if(first + second + third + fourth == target)
                    {
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(first);
                        tmp.add(second);
                        tmp.add(third);
                        tmp.add(fourth);
                        result.add(tmp);
                        left++;
                        right--;
                        while(nums[left] == nums[left-1] && left < right)
                            left++;
                        while(nums[right] == nums[right+1] && left < right)
                            right --;

                    }else if(first + second + third + fourth  < target)
                        left++;
                    else
                        right--;
                }
            }
        }
        return result;
    }
}

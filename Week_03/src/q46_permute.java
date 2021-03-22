package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q46_permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        for(int i = 0;i<nums.length;i++)
            path.add(nums[i]);

        dfs(nums, path, result, 0, nums.length);
        return result;

    }

    public void dfs(int[] nums, List<Integer> path, List<List<Integer>> result, int index, int length)
    {
        if( index == length -1)
        {
            result.add(new ArrayList<>(path));
            return;
        }else
        {
            for(int i = index; i<length;i++)
            {
                Collections.swap(path, index, i);
                dfs(nums, path, result, index +1, length);
                Collections.swap(path, index, i);
            }
        }
    }
}

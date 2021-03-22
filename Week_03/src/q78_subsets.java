package src;

import java.util.ArrayList;
import java.util.List;

public class q78_subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(nums, 0, path, result);
        return result;
    }

    public void dfs(int[] nums, int index, List<Integer> path, List<List<Integer>> result)
    {
        if(index <= nums.length-1)
        {
            result.add(new ArrayList<>(path));
            return;
        }else
        {
            for(int i = index; i< nums.length;i++)
            {
                path.add(nums[i]);
                dfs(nums, index+1, path, result);
                path.remove(path.size()-1);
            }
        }
    }
}

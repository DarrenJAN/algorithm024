import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class day22_permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if(nums.length == 0)
            return result;

        List<Integer> path = new ArrayList<>();
        for(int i = 0;i<nums.length;i++)
            path.add(nums[i]);

        backtrack(result,path, 0,nums.length);

        return result;
    }

    void backtrack(List<List<Integer>> result, List<Integer> path, int index, int n)
    {
        if(index == n)
            result.add(path);
        else
        {
            for(int i = index; i<n;i++)
            {
                Collections.swap(path, i, index);
                backtrack(result, path, index+1,n);
                Collections.swap(path, i, index);
            }
        }
    }

}

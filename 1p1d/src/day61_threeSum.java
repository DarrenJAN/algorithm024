import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day61_threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2;i++)
        {
            if(i>0 && nums[i] == nums[i-1])
                continue;;
            int j = i+1;
            int k = nums.length-1;

            while(j< k)
            {
                int a  = nums[i];
                int b = nums[j];
                int c = nums[k];

                if( a + b + c == 0)
                {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(a);
                    tmp.add(b);
                    tmp.add(c);
                    result.add(tmp);
                    j++;
                    k--;
                    while(nums[j] == nums[j-1] && j< k ) j++;
                    while(nums[k] == nums[k+1] && j< k ) k--;
                }else if(a + b + c <0)
                {
                    j++;
                }else
                    k--;


            }


        }

        return result;

    }
}

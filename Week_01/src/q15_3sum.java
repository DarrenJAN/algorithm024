import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q15_3sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i < nums.length-2; i++)
        {
            if(i>0)
            {
                if(nums[i]== nums[i-1]) continue;
            }

            int first = nums[i];

            int j = i +1;
            int k = nums.length-1;
            while(j < k)
            {
                int second = nums[j];
                int third = nums[k];
                if(first + second + third  == 0)
                {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(first);
                    tmp.add(second);
                    tmp.add(third);
                    result.add(tmp);
                    j++;
                    k--;
                    while( nums[j] == nums[j-1] && j< k)
                        j++;
                    while(nums[k] == nums[k+1] && j < k )
                        k--;
                }else if( first + second + third < 0)
                {
                    j++;
                }else
                    k--;

            }




        }
        return result;
    }
}

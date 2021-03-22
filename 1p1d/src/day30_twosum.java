import java.util.HashMap;

public class day30_twosum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i= 0;i<nums.length;i++)
        {
            hashMap.put(target - nums[i], i);
        }

        for(int i =0; i< nums.length;i++)
        {
            if(hashMap.containsKey(nums[i]))
            {
                if(hashMap.get(nums[i]) != i)
                {
                    res[0] = hashMap.get(nums[i]);
                    res[1] = i;
                    return res;
                }
            }
        }
        return res;
    }

}

import java.util.HashMap;

public class q1_twosum {

    /*
    1： 暴力求法：
    时间复杂度：O(N)
     */
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }

    /*
    2: 用个HaspMap 存储
    时间复杂度O(N)
     */
    public int[] twoSum2(int[] nums, int target) {
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
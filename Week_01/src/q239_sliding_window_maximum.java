import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class q239_sliding_window_maximum {
    /*
    第一种方法：暴力求解
    时间为：O(KN)
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];

        for(int i = 0 ;i < n - k+1;i++)
        {
            int min = nums[i];
            int cur = min;
            for(int j = 0 ; j < k ; j++)
            {
                cur = Math.max(nums[j+i], cur);
            }
            res[i] = cur;
        }
        return res;
    }

    /*
    方法2：双向队列
     */
    public int[] maxSlidingWindow2(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> integerDeque = new LinkedList<>();
        for(int i = 0; i<k;i++)
        {

            while( !integerDeque.isEmpty() && nums[i] > nums[integerDeque.peekLast()])
            {
                integerDeque.pollLast();
            }
            integerDeque.addLast(i);
        }

        int[] res = new int[n-k+1];
        res[0] = nums[integerDeque.peekFirst()];
        for(int i = k ;i < n;i++)
        {
            while( !integerDeque.isEmpty() && nums[i] > nums[integerDeque.peekLast()])
            {
                integerDeque.pollLast();
            }
            integerDeque.addLast(i);

            while(integerDeque.peekFirst() <= i-k)
            {
                integerDeque.pollFirst();
            }
            res[i -k +1] = nums[integerDeque.peekFirst()];
        }
        return res;
    }

}

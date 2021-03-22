import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class day50_maxSlidingWindow {
    //暴力法

    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0)
            return  new int[0];

        int[] result  = new int[nums.length - k +1];
        for(int i = 0;i<result.length;i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j = i;j<k+i;j++)
            {
                max = Math.max(max, nums[j]);
            }
            result[i] = max;
        }
        return result;
    }


    //单向队列
    public int[] maxSlidingWindow_2(int[] nums, int k) {
        if(nums.length == 0)
            return  new int[0];

        Deque<Integer> deque =  new LinkedList<>();
        int[] result = new int[nums.length - k + 1];
        for(int i = 0; i< nums.length;i++)
        {
            while(!deque.isEmpty() && nums[i] >= nums[deque.peekLast()])
            {
                deque.removeLast();
            }
            deque.addLast(i);

            if(deque.peekFirst() <= i-k)
            {
                deque.removeFirst();
            }

            if( i >= k-1)
            {
                result[i- k+1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }

}

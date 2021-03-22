import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class q239_maxSlideWindow {
    /*
    1. 优先队列

     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int length = nums.length;
        int[] result = new int[length - k +1];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for(int i = 0;i<length;i++)
        {
            int start = i-k;
            if(start >= 0)
            {
                priorityQueue.remove(nums[start]);
            }

            priorityQueue.offer(nums[i]);
            if(priorityQueue.size() == k)
            {
                result[i-k] = priorityQueue.peek();
            }
        }
        return result;
    }

    /*
    2. 双向队列
    存的是index
     */
    public int[] maxSlidingWindow2(int[] nums, int k) {
        int length = nums.length;
        Deque<Integer> deque = new LinkedList<>();
        int[] result = new int[length - k+1];

        for(int i = 0 ;i<length;i++)
        {
            while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[i])
            {
                deque.pollLast();
            }
            deque.addLast(i);

            if(deque.peekFirst() <= i-k)
            {
                deque.pollFirst();
            }
            if(i+1 >= k)
            {
                result[i-k +1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}

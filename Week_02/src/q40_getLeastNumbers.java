import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class q40_getLeastNumbers {
    /*
    1.暴力解法：
        先把arr sort，然后取前k个数
        时间：O(nlogn)

    2. 用优先队列 min_heap 一个一个插入
    然后一个一个delete
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int [] result = new int[k];
        for(int i = 0;i<k;i++)
        {
            result[i] = arr[i];
        }
        return result;
    }

    public int[] getLeastNumbers2(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2; // min_heap 依次插入最小值
            }
        });

        int [] result = new int[k];
        for(int i =0;i<arr.length;i++)
        {
            priorityQueue.offer(arr[i]);
        }

        for(int i = 0;i<k;i++)
        {
            result[i] = priorityQueue.poll();
        }
        return result;
    }
}

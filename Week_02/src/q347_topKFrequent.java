package DataStructure;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class q347_topKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        PriorityQueue<Node> priorityQueue = new PriorityQueue<Node>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o2.count - o1.count;
            }
        });

        //用哈希表来统计每个数字出现的次数
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            if(hashMap.containsKey(nums[i]))
                hashMap.put(nums[i], hashMap.get(nums[i])+1);
            else
                hashMap.put(nums[i], 1);
        }

        //插入优先队列（最大堆）
        for(Integer key: hashMap.keySet())
        {
            priorityQueue.offer(new Node(key, hashMap.get(key)));
        }

        //每次取最大堆的第一个元素
        for(int i = 0 ;i<k;i++)
        {
            Node tmp = priorityQueue.poll();
            result[i] = tmp.val;
        }
        return result;
    }

    public class Node{
        int val;
        int count;

        Node(int val, int count)
        {
            this.val = val;
            this.count = count;
        }
    }
}

package src;

import src.DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class q515_largestValues {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            TreeNode cur_node = queue.poll();
            for(int i =0;i<size;i++) {
                max = Math.max(max, cur_node.val);
                if (cur_node.left != null) queue.add(cur_node.left);
                if (cur_node.right != null) queue.add(cur_node.right);

            }
            result.add(max);
        }
        return result;
    }


}

import src.DataStructure.Node;

import java.util.*;

/*
   bfs 层序遍历首先想到用queue
 */

public class q429_levelOrder {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            List<Integer> currentlist = new ArrayList<>();
            for(int i =0;i<size;i++)
            {
                Node tmp = queue.remove();
                currentlist.add(tmp.val);

                for(Object object : tmp.children)
                {
                    queue.add((Node) object);

                }
            }
            result.add(currentlist);

        }
        return result;
    }
}



import DataSturcture.Node;

import java.util.ArrayList;
import java.util.List;

public class day39_preorder {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;

    }

    public void helper(Node root, List<Integer> result)
    {
        if(root == null)
            return;
        else
        {
            result.add(root.val);
            for(Object child: root.children)
            {
                helper((Node) child, result);
            }
        }
    }
}

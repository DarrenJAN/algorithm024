import src.DataStructure.Node;

import java.util.ArrayList;
import java.util.List;

public class q589_preorder {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    public void helper(Node root, List<Integer> result)
    {
        if(root == null)
            return;
        else {
            result.add(root.val);
            for(Object object : root.children)
            {
                helper((Node)object, result);
            }
        }
    }
}

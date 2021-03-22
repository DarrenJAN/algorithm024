import src.DataStructure.Node;

import java.util.ArrayList;
import java.util.List;

public class q590_postorderTraversal {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return  result;
    }

    public void helper(Node root, List<Integer> result)
    {
        if(root== null)
            return;
        else
        {
            for(Object object: root.children)
            {
                helper((Node)object, result);
            }
            result.add(root.val);
        }
    }
}

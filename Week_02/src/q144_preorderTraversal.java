import src.DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class q144_preorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    public void helper(TreeNode root, List<Integer> result)
    {
        if(root == null)
            return;
        else
        {
            result.add(root.val);
            helper(root.left, result);
            helper(root.right, result);
        }
    }
}

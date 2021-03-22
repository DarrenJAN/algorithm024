import java.util.ArrayList;
import java.util.List;
import DataSturcture.TreeNode;

public class day15_inorder_traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder_helper(root, result);
        return  result;
    }

    public void inorder_helper(TreeNode root, List<Integer> result)
    {
        if(root == null)
            return;
        else
        {
            inorder_helper(root.left, result);
            result.add(root.val);
            inorder_helper(root.right, result);

        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

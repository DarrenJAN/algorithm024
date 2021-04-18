package src;

import src.DataStructure.TreeNode;

public class q104_maxDepth {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        else
        {
            return Math.max(maxDepth(root.left) +1 , maxDepth(root.right) +1);
        }
    }
}

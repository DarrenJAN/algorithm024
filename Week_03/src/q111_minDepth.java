package src;

public class q111_minDepth {
    /*
    这个写法应该可以优化的
     */
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        else
        {
            int left = minDepth(root.left) +1;
            int right = minDepth(root.right) +1;

            if(root.left == null && root.right == null)
                return 1;
            else if(left == 1)
                return right;
            else if(right == 1)
                return left;
            else
                return Math.min(left, right);
        }
    }
}

package src;

import src.DataStructure.TreeNode;

public class q98_isValidBST {
    /*
    判断是否是有效二叉树：
        左子树的所有节点小于当前节点
        右子树的所有节点大于当前节点

        如果右边小于低界限，return false
        如果左边大于高界限，return false

        此方法老是记不住，建议就用inorder 遍历
     */
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    public boolean helper(TreeNode root, Integer upper_bound, Integer lower_bound) {
        if (root == null)
            return true;
        else {
            if (lower_bound != null && root.val <= lower_bound)
                return false;
            if (upper_bound != null && root.val >= upper_bound)
                return false;

            return helper(root.right, upper_bound, root.val) &&
                    helper(root.left, root.val, lower_bound);

        }
    }


    /*
    中序遍历
    每次比前面一个大
     */

    Integer pre = null;
    public boolean isValidBST2(TreeNode root) {
        if (root == null)
            return true;


        if(! isValidBST2(root.left))
            return false;

        if(pre != null && pre >= root.val)
            return false;
        pre= root.val;

        if(! isValidBST2(root.right))
                return false;

        return true;
    }

}

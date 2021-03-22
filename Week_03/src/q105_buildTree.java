package src;

import java.util.HashMap;

public class q105_buildTree {
    /*
    用前序 和 中序 来构造Tree
    前序遍历 preorder = [3,9,20,15,7]
    中序遍历 inorder = [9,3,15,20,7]
    1. pre里面每个都是 当前的root 节点
    2. 节点在中序中查找，左边的是 左子树， 右边的是 右子树
     */
    int pre_index = 0;
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0;i<preorder.length;i++)
        {
            hashMap.put(inorder[i], i);
        }
        return helper(preorder, inorder, 0, preorder.length-1);
    }

    public TreeNode helper(int[] preorder, int[] inorder, int left, int right)
    {
        if(left > right)
            return null;

        int root_num = preorder[pre_index];
        pre_index++;

        int order_index = hashMap.get(root_num);

        if(left == right)
            return new TreeNode(root_num);

        TreeNode root = new TreeNode(root_num);
        root.left = helper(preorder, inorder, left, order_index-1);
        root.right = helper(preorder, inorder, order_index+1, right);
        return root;
    }
}

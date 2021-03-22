public class day13_maximum_depth_binary_tree {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;

        int right = 1 + maxDepth(root.right);
        int left = 1 + maxDepth(root.left);

        return Math.max(right, left);

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

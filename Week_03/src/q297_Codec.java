package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q297_Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder stringBuilder = new StringBuilder();
        to_string(root, stringBuilder);
        return stringBuilder.toString();
    }

    public void to_string(TreeNode root, StringBuilder stringBuilder)
    {
        if(root == null)
        {
            stringBuilder.append("null,");
            return;
        }

        else
        {
            stringBuilder.append(root.val + ",");
            to_string(root.left, stringBuilder);
            to_string(root.right, stringBuilder);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] strings = data.split(",");
        List<String> stringList = new ArrayList<>(Arrays.asList(strings));

        return to_treenode(stringList);

    }

    public TreeNode to_treenode(List<String> stringList)
    {
        if(stringList.get(0).equals("null"))
        {
            stringList.remove(0);
            return null;
        }
        else
            {
            String tmp = stringList.get(0);
            stringList.remove(0);
            TreeNode root = new TreeNode(Integer.parseInt(tmp));
            root.left = to_treenode(stringList);
            root.right = to_treenode(stringList);
            return root;
        }
    }

}

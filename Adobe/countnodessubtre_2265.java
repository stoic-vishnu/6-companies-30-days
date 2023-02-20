package Adobe;
import java.util.*;

import GoldmanSachs.TreeNode;
public class countnodessubtre_2265 {
    private static int count = 0;

    public static int[] subtree_order(TreeNode root) {
        if (root == null) {
            // total sum , total node
            return new int[] { 0, 0 };
        }
        int[] left = subtree_order(root.left);
        int[] right = subtree_order(root.right);
        int totalsum = left[0] + right[0] + root.val;
        int totalnode = left[1] + right[1] + 1;
        if (totalsum / totalnode == root.val) {
            count++;
        }
        return new int[] { totalsum, totalnode };
    }

    public static int averageOfSubtree(TreeNode root) {
        if (root == null) {
            return count;
        }
        subtree_order(root);
        return count;
    }
    public static void main(String[] args) {
        int[] root = {4,8,5,0,1,(Integer) null,6};
       System.out.println(averageOfSubtree(root));
    }

    private static char[] averageOfSubtree(int[] root) {
        return null;
    }
}

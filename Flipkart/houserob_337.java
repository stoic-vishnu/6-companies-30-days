package Flipkart;
import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
public class houserob_337 {
    public int[] robmoney(TreeNode root) {
        if (root == null)
            return new int[2];
        int[] left = robmoney(root.left);
        int[] right = robmoney(root.right);
        int[] res = new int[2];
        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        res[1] = root.val + left[0] + right[0];
        return res;
    }

    public int rob(TreeNode root) {
        int[] res = robmoney(root);
        return Math.max(res[0], res[1]);
    }
    public static void main(String[] args) {
        root = {3,4,5,1,3,null,1};        
        System.out.println(rob(root));

    }
}

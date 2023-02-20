package GoldmanSachs;
import java.util.*;

import javax.swing.tree.TreeNode;

import org.w3c.dom.Node;
public class elein2bst_1305 {
    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    private static List<Integer> mergesort(List<Integer> l1, List<Integer> l2) {
        List<Integer> k = new ArrayList<>();
        int i = 0, j = 0;
        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) < l2.get(j)) {
                k.add(l1.get(i++));
            } else
                k.add(l2.get(j++));
        }
        while (i < l1.size())
            k.add(l1.get(i++));
        while (j < l2.size())
            k.add(l2.get(j++));
        return k;
    }

    private static void inorder(List<Integer> root2, List<Integer> l1) {
        if (root2 == null)
            return;
        inorder(root2.left, l1);
        l1.add(root2.val);
        inorder(root2.right, l1);
    }
    public static List<Integer> main(String[] args) {
        List<Integer> root1=Arrays.asList(2,1,4);
        List<Integer> root2=Arrays.asList(1,0,3);
        // Tree tree = new Tree();
        // Node root = new Node(5);
        // tree.insert(root,2);
        System.out.println();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        inorder(root1, list1);
        inorder(root2, list2);
        return mergesort(list1, list2);
    }
}


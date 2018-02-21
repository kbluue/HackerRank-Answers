package Cracking_The_Code_INTERVIEWS;

/**
 * Created by _kbluue_ on 2/15/2018.
 */
public class Trees__Is_This_A_Binary_Search_Tree_ {

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    boolean checkBST(Node root) {
        return checkRoot(root) && checkBST(root.right) && checkBST(root.left);
    }

    boolean checkRoot(Node root){
        if (root == null) return true;
        boolean b1 = true, b2 = true;
        if (root.left != null) b1 = root.data > root.left.data;
        if (root.right != null) b2 = root.data < root.right.data;
        return b1 && b2;
    }
}

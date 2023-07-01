import java.util.*;

public class printBTree {
    
    public static void inOrder(BTree root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    
    public static void preOrder(BTree root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    public static void postOrder(BTree root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
    
    public static void insertIntoBST(BTree root, int x) {
        int rootVal = root.val;
        if (x < rootVal) {
            if (root.left == null) {
                root.left = new BTree(x);
            } else {
                insertIntoBST(root.left, x);
            }
        } else {
            if (root.right == null) {
                root.right = new BTree(x);
            } else {
                insertIntoBST(root.right, x);
            }
        }
    }
    
    
    public static void printBFS(BTree root) {
        Queue<BTree> qe = new LinkedList<>();
        if (root == null) {
            return;
        }
        qe.add(root);
        while (! qe.isEmpty()) {
            BTree temp = qe.remove();
            System.out.print(temp.val + " ");
            if (temp.left != null) {
                qe.add(temp.left);
            }
            if (temp.right != null) {
                qe.add(temp.right);
            }
        }
    }
    
    public static void printDFS(BTree root) {
        Stack<BTree> s = new Stack<>();
        if (root == null) {
            return;
        }
        s.push(root);
        while (! s.isEmpty()) {
            BTree temp = s.pop();
            System.out.print(temp.val + " ");
            if (temp.right != null) {
                s.push(temp.right);
            }
            if (temp.left != null) {
                s.push(temp.left);
            }
        }
    }
    
    public static void main(String[] args) {
        BTree root = new BTree(7);
        root.left = new BTree(3);
        root.right = new BTree(11);
        root.left.left = new BTree(1);
        root.left.right = new BTree(5);
        root.right.left = new BTree(9);
        root.right.right = new BTree(13);
        
        /*inOrder(root);
        insertIntoBST(root, 4);
        System.out.println();
        inOrder(root);
        */
        printBFS(root);
        System.out.println();
        printDFS(root);
    }
}


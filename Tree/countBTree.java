public class countBTree {
    public static void main(String[] args) {
        BTree root = new BTree(7);
        root.left = new BTree(3);
        root.right = new BTree(11);
        root.left.left = new BTree(1);
        root.left.right = new BTree(5);
        root.right.left = new BTree(9);
        root.right.left.right = new BTree(10);
        root.right.right = new BTree(13);
        
        System.out.println("total number of nodes: " + countNodes(root));
        System.out.println("total number of leaf nodes: " + countLeafNodes(root));
        System.out.println("height of tree: " + height(root));
    }
    
    public static int countNodes(BTree root) {
        int count = 0;
        if (root == null) {
            return 0;
        } else {
            count++;
            count += countNodes(root.left);
            count+= countNodes(root.right);
        }
        return count;
    }
    
    public static int countLeafNodes(BTree root) {
        int count = 0;
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            count++;
        } else {
            count += countLeafNodes(root.left);
            count += countLeafNodes(root.right);
        }
        return count;
    }
    
    public static int height(BTree root) {
        int maxHeight = 0;
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        maxHeight++;
        if (height(root.left) > height(root.right)) {
            maxHeight += height(root.left);
        } else {
            maxHeight += height(root.right);
        }
        return maxHeight;
    }
}


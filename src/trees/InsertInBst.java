package trees;


public class InsertInBst {


    public static TreeNode insert(TreeNode root, int key) {

        if(root == null) {
            TreeNode node = new TreeNode(key);
            return node;
        }

        if (root.data < key) {
            TreeNode rightSideTreeNode =
                    insert(root.right, key);
            root.right = rightSideTreeNode;
        } else {
            TreeNode leftTreeNode =
                    insert(root.left, key);
            root.left = leftTreeNode;
        }
        return root;
    }

    public static boolean isAvailable(TreeNode root, int key) {


        if(root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }

        if (root.data < key) {
            boolean isAvailableRightSide =
                    isAvailable(root.right, key);

            return isAvailableRightSide;
        } else {
            boolean isAvailableLeftSide =
                    isAvailable(root.left, key);

            return isAvailableLeftSide;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(13);
        root.left.left.left=new TreeNode(4);
        root.left.left.right = new TreeNode(9);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(22);
        root.right.right.left= new TreeNode(21);

        System.out.println(isAvailable(root, 34));
        insert(root, 34);

        System.out.println(isAvailable(root, 34));


    }
}

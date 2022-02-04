package trees;




public class BinaryTree {


    public static void inorderTraversal(TreeNode root) {

        if(root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.println(root.data);
        inorderTraversal(root.right);
    }

    public static void preOrderTraversal(TreeNode root) {

        if(root == null) {
            return;
        }
        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void postOrderTraversal(TreeNode root) {

        if(root == null) {
            return;
        }
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        System.out.println(root.data);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(4);

        root.right = new TreeNode(3);

        root.left.left = new TreeNode(2);

        root.left.right = new TreeNode(1);

        root.right.left = new TreeNode(6);

        root.right.right = new TreeNode(7);

        postOrderTraversal(root);
    }
}

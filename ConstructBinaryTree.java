// Java program to construct binary tree from 
// given array in level order fashion 

public class ConstructBinaryTree {
    TreeNode root;

    // Tree Node
    static class TreeNode {
        int data;
        TreeNode left, right;
        TreeNode(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Function to insert nodes in level order
    public TreeNode insertLevelOrder(int[] arr, TreeNode root,
                                 int i)
    {
        // Base case for recursion
        if (i < arr.length) {
            TreeNode temp = new TreeNode(arr[i]);
            root = temp;

            // insert left child
            root.left = insertLevelOrder(arr, root.left,
                    2 * i + 1);

            // insert right child
            root.right = insertLevelOrder(arr, root.right,
                    2 * i + 2);
        }
        return root;
    }

    // Function to print tree nodes in InOrder fashion
    public void inOrder(TreeNode root)
    {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    // Driver program to test above function
    public static void main(String args[])
    {
        ConstructBinaryTree t2 = new ConstructBinaryTree();
        int arr[] = {10, 3,12,16, 2, 5, 6,};
        t2.root = t2.insertLevelOrder(arr, t2.root, 0);
      t2.inOrder(t2.root);
    }
} 

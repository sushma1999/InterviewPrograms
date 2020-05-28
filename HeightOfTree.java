
class HeightNode
{
    int key;
    HeightNode left = null, right = null;

    HeightNode(int key) {
        this.key = key;
    }
}

class HeightOfTree
{
    // Recursive function to calculate height of given binary tree
    public static int height(HeightNode root)
    {
        // Base case: empty tree has height 0
        if (root == null) {
            return 0;
        }

        // recur for left and right subtree and consider maximum depth
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args)
    {
        HeightNode root = null;

        root = new HeightNode(15);
        root.left = new HeightNode(10);
        root.right = new HeightNode(20);
        root.left.left = new HeightNode(8);
        root.left.right = new HeightNode(12);
        root.right.left = new HeightNode(16);
        root.right.right = new HeightNode(25);

        System.out.print("The height of the binary tree is " + height(root));
    }
}
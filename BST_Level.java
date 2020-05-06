import java.util.*;
class TreeNode {
    TreeNode left,right;
    int data;
    TreeNode(int data){
        this.data=data;
        left=right=null;
    }
}
class BST_Level{

     static Queue<TreeNode> myQueue = new LinkedList<TreeNode>() ;

    static void levelOrder(TreeNode root) {
        if (root != null) {

            myQueue.add(root);
        }
        while (!myQueue.isEmpty()){
            TreeNode temp=myQueue.remove();
            System.out.print(temp.data + " ");
            if(temp.left!=null){
                myQueue.add(temp.left);
            }
            if(temp.right!=null){
                myQueue.add(temp.right);
            }
        }


    }
    public static TreeNode insert(TreeNode root, int data){
        if(root==null){
            return new TreeNode(data);
        }
        else{
            TreeNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        TreeNode root=null;
        while(T-- > 0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
package B7_Binary_trees;

public class B9_kth_level {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static void klevel(Node root, int level, int k){
        if(root==null){
            return;
        }

        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        klevel(root.left,level+1,k);
        klevel(root.right,level+1,k);

    }
    public static void main(String[] args) {
            /*
                        1
                       / \
                       2  3
                      / \ /\
                      4 5 6 7
             */
    
             Node root=new Node(1);
             root.left=new Node(2);
             root.right=new Node(3);
             root.left.left=new Node(4);
             root.left.right=new Node(5);
             root.right.left=new Node(6);
             root.right.right=new Node(7); 
             int k=3;
             klevel(root,1,k);
    }
}

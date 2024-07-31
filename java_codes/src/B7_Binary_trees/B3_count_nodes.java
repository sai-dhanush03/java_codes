package B7_Binary_trees;

public class B3_count_nodes {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }

    public static int count(Node root){
         if(root==null){
            return 0;
         }

         int leftcount=count(root.left);
         int rightcount=count(root.right);
         return leftcount+rightcount+1;
    }

    public static int sum(Node root){
        if(root==null){
            return 0;
        }

        int ls=sum(root.left);//left sum
        int rs=sum(root.right);//right sum
        return ls+rs+root.data;
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

         System.out.println("No.of nodes = "+count(root));
         System.out.println("sum of nodes = "+sum(root));
        
    }
}

package B8_Binary_search_tree;
// delete nodes
// insert nodes
// print in range

public class B2_delete_node {
     static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            // left and right are defaultly null as it is static
        }
     }

     public static Node delete(Node root,int val){
        if(root.data<val){
            root.right=delete(root.right,val);
        }

        else if(root.data>val){
            root.left=delete(root.left,val);
        }
        else{//cases

            // case 1=leaf node
            if(root.left==null&&root.right==null){
                return null;
            }

            // case 2= single child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }

            // case 3  both children
            Node Is=findInorderSuccessor(root.right);
            root.data=Is.data;
            delete(root.right,Is.data);
        }

        return root;
     }

     public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;

        }
        return root;
     }


     public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            // insert in left subtree
            root.left=insert(root.left,val);
            // root.left=new Node(val);
        }else{
            // ri8 subtree
            root.right=insert(root.right,val);
        }

        return root;
    }


    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    // *******************************print in range*************************


    public static void printinrange(Node root,int k1, int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printinrange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printinrange(root.right,k1,k2);
        }
        else if(root.data<k1){
            printinrange(root.right,k1,k2);
        }else{
            printinrange(root.left,k1,k2);
        }
    }

     public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for(int i=0;i<values.length;i++){
            // root=insert(root,values[i]);
           root= insert(root,values[i]);

        }


        // inorder(root);
        // System.out.println();

        // root=delete(root,10);
        // System.out.println();

        // inorder(root);
        // System.out.println();
        printinrange(root, 3, 12);

     }


     
}

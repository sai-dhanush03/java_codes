package B8_Binary_search_tree;

public class B1_build_bst {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    // ****************build bst***********************

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
        System.out.println(root.data+" ");
        inorder(root.right);
    }


    // ****************search in BST******************************
    public static boolean search(Node root,int key){//O(H)=time complexity
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left,key);
        }

        else{
            return search(root.right,key);
        }
    }

     public static void main(String[] args) {
        int[] values={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            // root=insert(root,values[i]);
           root= insert(root,values[i]);

        }



        inorder(root);
        System.out.println();

        if(search(root,10)){
            System.out.println("found");
        }else{
            System.out.println("Not found");
        }

    }
}

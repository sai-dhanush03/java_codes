package B8_Binary_search_tree;
import java.util.*;

public class B3_root_to_leaf {
     static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
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
// print path
public static void printpath(ArrayList<Integer> path){
    for(int i=0;i<path.size();i++){
        System.out.print(path.get(i)+" ->");
    }
    System.out.println("null");
}
// ******root_to_leaf********
public static void printroot2leaf(Node root,ArrayList<Integer> path){
    if(root==null){
        return;
    }
    path.add(root.data);
    if(root.left==null && root.right==null){
        printpath(path);
    }
    printroot2leaf(root.left, path);
    printroot2leaf(root.right, path);
    path.remove(path.size()-1);

}



// **********************VALID BST*************
public static boolean isvalidbst(Node root, Node min,Node max){
    if(root==null){
        return true;
    }

    if(min!=null && root.data<=min.data){
        return false;
    }

    else if(max!=null && root.data>=max.data){
        return false;
    }

    return isvalidbst(root.left,min,root) && isvalidbst(root.right,root,max);


}


public static Node  mirror(Node root){//O(n)
    if(root== null){
        return null;
    }

    Node leftmirror=mirror(root.left);
    Node rightmirror=mirror(root.right);
    
    root.left=rightmirror;
    root.right=leftmirror;

    return root;

}


    public static void main(String[] args) {
        int[] values={8,5,3,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            // root=insert(root,values[i]);
           root= insert(root,values[i]);

        }



        inorder(root);
        System.out.println();

        // printroot2leaf(root,new ArrayList<>());
        // if(isvalidbst(root,null,null)){
        //     System.out.println("valid");
        // }else{
        //     System.out.println("Not valid");
        // }

        mirror(root);
        inorder(root);




    
}

}

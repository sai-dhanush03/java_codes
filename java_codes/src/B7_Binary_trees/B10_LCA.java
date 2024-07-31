package B7_Binary_trees;
import java.util.*;
public class B10_LCA {//Lowest common ancestor
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

    // *******************APPROACH 1*********************


    public static boolean getpath(Node root, int  n, ArrayList<Node> path){//O(n)
        if(root==null){
            return false; 
        }
        
        path.add(root);
        if(root.data==n){
            return true;
        }
        boolean foundleft=getpath(root.left,n,path);
        boolean foundright=getpath(root.right,n,path);

        if(foundleft||foundright){
            return true;
        }

        path.remove(path.size()-1);
        return false;

    }

    public static Node lca(Node root, int n1, int n2){//O(n)
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();
        getpath(root,n1,path1);
        getpath(root,n2,path2);

        //last common ancestor
        int i=0;
        for(;i<path1.size()&&i<path2.size();i++){//O(n)
            if(path1.get(i)!=path2.get(i)){
                break;
            }

        }
        // last equal node is at (i-1)th node
        Node lca=path1.get(i-1);
        return lca;
    }





    // *******************APPROACH 2*********************

    public static Node lca2(Node root, int n1, int n2){
        if(root==null){
            return root;
        }
        if(root.data==n1||root.data==n2){
            return root;
        }

        Node leftlca=lca2(root.left, n1, n2);
        Node rightlca=lca2(root.right, n1, n2);

        // leftlca=some val ; rightlca=null
        if(rightlca==null){
            return leftlca;
        }

        if(leftlca==null){
            return rightlca;
        }

        return root;

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
             
             int n1=4,n2=7;
             System.out.println(lca(root,n1,n2).data);
             System.out.println(lca2(root, n1, n2).data);
    }
    
}

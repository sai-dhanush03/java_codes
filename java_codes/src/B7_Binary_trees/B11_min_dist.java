package B7_Binary_trees;

// it contains 2 approaches of LCA , min dist between nodes
// it also contains kth ancestor of a node 

import java.util.ArrayList;

public class B11_min_dist {//min dist b/w 2 nodes
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



    // *********************MIN DIST B/W NODES************************

    public static int lcadist(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }

        int leftdist=lcadist(root.left,n);
        int rightdist=lcadist(root.right,n);

        if(leftdist==-1 && rightdist==-1){
            return -1;
        }else if(leftdist==-1){
            return rightdist+1;
        }else{
            return leftdist+1;
        }
    }


    public static int mindist(Node root,int n1, int n2){
        Node lca=lca2(root,n1,n2);
        int dist1=lcadist(lca,n1);
        int dist2=lcadist(lca,n2);

        return dist1+dist2;
    }
    // **************************kth Ancestor*********************************

    public static int kAncestor(Node root, int n, int k){
        if(root==null){
            return -1;
        }

        if(root.data==n){
            return 0;
        }

        int leftdist=kAncestor(root.left,n,k);
        int rightdist=kAncestor(root.right,n,k);


        if(leftdist==-1 && rightdist==-1){
            return -1;
        }

        int max=Math.max(leftdist,rightdist);
        if(max+1==k){
            System.out.println(root.data);
        }

        return max+1;
            
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
            //  System.out.println(lca(root,n1,n2).data+" least common ancestor");
            //  System.out.println(lca2(root, n1, n2).data+" least common ancestor");
            //  System.out.println( mindist(root,4,5)+" min dist b/w 2 nodes");
             kAncestor(root, 4, 1);
    }
    
}

package B7_Binary_trees;

public class B4_diameter {
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

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    
    public static int diameter2(Node root){//O(n^2)
        if(root==null){
            return 0;
        }

        int leftdiam=diameter2(root.left);
        int leftht=height(root.left);
        int rightdiam=diameter2(root.right);
        int rightht=height(root.right);

        int selfdiam=leftht+rightht+1;//diam which passes through the root(it self)
        return Math.max(selfdiam,Math.max(leftdiam,rightdiam));
        //math.max only capable to compare 2 variables so we used above line to compare three variables


    }

    static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam=diam;
            this.ht=ht;
        }

    }

    public static Info diameter(Node root){//O(n)//optimized approach coz here height is 
        // not calculating with different fun which increases O(n)
        if(root==null){
            return new Info(0,0);
        }
        Info leftInfo=diameter(root.left);
        Info rightInfo=diameter(root.right);

        int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1; 
        
        return new Info(diam,ht);

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

             System.out.println(diameter(root).diam);
             System.out.println(diameter(root).ht);

            //  System.out.println(diameter2(root));
    }
    
}

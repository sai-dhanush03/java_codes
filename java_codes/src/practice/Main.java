package practice;
import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        val=this.val;
        left=null;
        right=null;
    }
}

public class Main {

    public static void main(String[] args){
        String s;
        Scanner sc=new Scanner(System.in);
        // for(int i=0;i<)
        s=sc.nextLine();
        String words []=s.split(" ");
        // ArrayList<Integer> a=new ArrayList<>();
        // for(int i=0;i<words.length;i++){
        //     System.out.println(words[i]);
        //     a.add(Integer.parseInt(words[i]));
        // }
        // System.out.println(a);    // 1 2 3 n n 5 6 7

        Queue<TreeNode> q=new LinkedList<>();
        int idx=0;

        TreeNode head=new TreeNode(Integer.parseInt(words[0]));
        while(!q.isEmpty() && idx<words.size()){
            int l=q.size();
            for(int i=0;i<l;i++){
                if(words[idx]!="n"){
                    TreeNode p=q.remove();
                    p.left=new TreeNode(Integer.parseInt(words[idx]));
                }
                idx++;
                if(words[idx]!="n" && idx<words.length){
                    // TreeNode p=q.remove();
                    p.right=new TreeNode(Integer.parseInt(words[idx]));
                }
                idx++;

            }

        }


        



    }
}

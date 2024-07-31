package B11_Tries;
// find shortest unique prefix for every word in a given list.
// assume no word is prefix of another

public class T3_prefix_problem {
    static class Node{
        Node[] children=new Node[26];
        boolean eow=false;
        int freq;

        public Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;

            }
            freq=1;
        }
    }
    public static Node root=new Node();

    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }else{
                curr.children[idx].freq++;
            }

            curr=curr.children[idx];

        }
    }

    public static String searchprefix(String word){
        Node curr=root;
        String ans="";
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx].freq==1){
                ans=ans+word.charAt(i);
                return ans;

            }
            ans=ans+word.charAt(i);
            curr=curr.children[idx];
        }

        return "";

    }


    public static void main(String[] args) {
        String arr[]={"zebra","dog","duck","dove"};
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            // sout
            
            System.out.println(searchprefix(arr[i]));
        }


    }
}

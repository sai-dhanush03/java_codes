package B11_Tries;
// given an input string and a dictionary of words find out if the input string can be broken into a space seperated sequence of dicrionary words.
// words[]={i,like,sung,samsung}
// key=ilikesamsung

public class T2_wordBreak {
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;

        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();

    public static void insert(String word){//O(L)
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            // curr=curr.children{idx};
            curr=curr.children[idx];

            
        }

        curr.eow=true;

    }

    public static boolean search(String key){//O(L)
        Node curr=root;
        for(int level=0;level<key.length();level++){
            int idx=key.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];

        }
        return curr.eow==true;
        // return true;
    }

    public static boolean wordBreak(String key){//O(key.length)
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            //  substring(beg idx to last idx) where last idx is not included so here <=key.length
            if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
                return true;
            }
            // key.substring(i);which means substring wid st idx as i and ending idx as string.length
        }
        return false;
    }
    public static void main(String[] args) {
        String arr[]={"i","like","sam","samsung","mobile","ice"};
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }

        // String key="ilikesamsung";
        String key="ilikesam";
        System.out.println(wordBreak(key));
    }
}

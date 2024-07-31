package alpha_codes.Backtracking;

public class B3_permutations {
    public static void permutations(String str, String ans){
        // base case
        if(str.length()==0){
            System.out.println(ans);
            return;

        }
        // RECURSION
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);//if ending index is not given it automatically takes str.length()-1 as last index
            permutations(newstr,ans+curr);
            
        }
    }
    public static void main(String[] args) {
        String str="abc";
        permutations(str,"");
        // System.out.println(ans);
    }
}

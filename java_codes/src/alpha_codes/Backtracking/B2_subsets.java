package alpha_codes.Backtracking;

public class B2_subsets {

    public static void findsubsets(String str, String ans,int i){
        // base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.print("null");
                // return;
            }
            else{
                System.out.println(ans);
                // return;
            }
            return;
        }
        // yes case
        findsubsets(str,ans+str.charAt(i),i+1);
        // no case
        findsubsets(str,ans,i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        findsubsets(str,"",0);
    }
}

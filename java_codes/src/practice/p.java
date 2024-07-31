package practice;
import java.util.*;

public class p {
    
    public static TreeNode right;
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String ans="";
        String temp=strs[0];
        System.out.println(temp);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            int a=strs[i].length();
            min=Math.min(min,a);
            if(a==min){
              temp=strs[i];
            }
        }
        System.out.print(temp);
        for(int i=0;i<min;i++){
            for(int j=0;j<strs.length;j++){
                if(temp.charAt(i)!=strs[j].charAt(i)){
                    return ans;
                }

            }
                ans=ans+temp.charAt(i);

        }
        return ans;

    }
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        longestCommonPrefix(str);
    }

    
}

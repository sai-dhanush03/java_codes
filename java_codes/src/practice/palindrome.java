package practice;
import java.util.*;

public class palindrome {
    public static String longestPalindrome(String s) {
        String s1=new String();
        ArrayList<String> list=new ArrayList<>();
        
        s1="";
        
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                s1=s1+s.charAt(j);
                if(isPalindrome(s1)){
                    list.add(s1);
                }

                
            }
            s1="";
        }
        // System.out.println(list);

        // ArrayList<String> plndrm=new ArrayList<>();
        // for(int i=0;i<list.size();i++){
        //     StringBuilder a=new StringBuilder();
        //     String b=list.get(i);
        //     a.append(b);
        //     a.reverse();
        //     String b1=a.toString();
        //     if(b.equals(b1)){
        //         plndrm.add(b);
        //     }
        //  }
        //  System.out.println(plndrm);

         String lngst="";
         for(int i=0;i<list.size();i++){
            String temp=list.get(i);
            if(temp.length()>lngst.length()){
                lngst=temp;
            }

         }
        //  System.out.println(lngst);
         return lngst;



        // return s;
        // absdfcc
        
    }
    public static boolean isPalindrome(String s){
        int st=0;
        int end=s.length()-1;
        while(st<end){
            if(s.charAt(st)!=s.charAt(end)){
                return false;
            }
            st++;
            end--;

        }
        return true;



    }
    
    public static void main(String[] args) {
        String s="abcdefghll";
        

        // isPalindrome(s);
        
        System.out.println(longestPalindrome(s));
    }
}

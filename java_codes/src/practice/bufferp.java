package practice;

import java.util.Scanner;

class bufferp {
    

    public static int ans(String s){
        int ans=0;
        // for(int i=0;i<s.length();i++){
        //     // System.out.println(ans);
        //     // ans=ans+Integer.valueOf(s.substring(i,i+1));
        //     ans=ans+Integer.parseInt(s.substring(i,s.length()));
        //     // System.out.println(ans);
        // }
        // for(int i=s.length()-1;i>0;i--){
        //     ans=ans+Integer.parseInt(s.substring(0,i));

        // }

        // System.out.println(ans);
        // return ans;
        String temp;
        Integer.valueOf(s);

        for(int i=0;i<s.length();i++){ 
                temp=""  ;    //1 2 3
            for(int j=i;j<s.length();j++){
                temp=temp+s.charAt(j);
                System.out.println(temp);
                ans=ans+Integer.parseInt(temp);
               
                // ans=ans+Integer.parseInt(s.substring(i,j+1));
                
            }
        }
        return ans;
    }

  
    public  static void main(String[] args) {
        // sumnum(1,4);
        // System.out.println(sumnum(1,4,0));
        String s="3214";
        // System.out.println(s+5);
        // System.out.println(s.substring(0,0)+"s");
        // ans(s);
        System.out.println(ans(s));
    }
}

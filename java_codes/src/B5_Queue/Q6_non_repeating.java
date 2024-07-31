package B5_Queue;
import java.util.*;
// all characters are lower case
// find 1st non repeating character in the given input stream


public class Q6_non_repeating {
      public static void non_repeating(String s){//O(n)
        int[] freq=new int[26];
        char ch;
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty()&&freq[q.peek()-'a']>1){
                q.remove();

            }
            if(q.isEmpty()){
                System.out.println(-1+" ");
            }else{
                System.out.println(q.peek());
            }
        }
        System.out.println();
      }
      public static void main(String[] args) {
        String str="aabccxb";
        non_repeating(str);
        

      }
}

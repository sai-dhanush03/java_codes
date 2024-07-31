package B4_Stacks;
import java.util.*;

// four forms of this question
// next grtr right
// next grtr left
// next smallers right
// next smaller left
// just do necessary small changes

public class S8_nxt_grtr {
     public static void nextgreater_byme(int arr[]){
        Stack<Integer> s=new Stack<>();
        int next_grtr[]= new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                next_grtr[i]=-1;
                
            }
            else{
                next_grtr[i]=s.peek();
            }
            s.push(arr[i]);
        }

        //printing the required array

        for(int i=0; i<next_grtr.length;i++){
            System.out.print(next_grtr[i]+" ");
        }
        System.out.println();


    }

    public static void next_greater(int arr[]){
        Stack<Integer> s=new Stack<>();
        // store index inside the stack
        int next_grtr[]= new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            // while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            // if else

            if(s.isEmpty()){
                next_grtr[i]=-1;
            }
            else{
                next_grtr[i]=arr[s.peek()];
            }
            // push into stack
            s.push(i);
        }

         for(int i=0; i<next_grtr.length;i++){
            System.out.print(next_grtr[i]+" ");
        }

    }


    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        nextgreater_byme(arr);
        next_greater(arr);
        // printarr(next_grtr);
    }
}

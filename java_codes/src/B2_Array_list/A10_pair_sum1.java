package B2_Array_list;
import java.util.ArrayList;

public class A10_pair_sum1 {

    // as array i sorted we can use 2 pointer approach

// for optimized approach O(n)
    public static boolean pair_sum(ArrayList<Integer> list, int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            int num=list.get(lp)+list.get(rp);
            if(num==target){
                return true;
                // System.out.println(list.get(lp)+" "+list.get(rp));


            }
            else if(num<target){
                lp++;
            }
            else{//num>target
                rp--;
            }
        }
        return false;
    }

    //brute force approach
    public static boolean pairsum(ArrayList<Integer> list, int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int num=list.get(i)+list.get(j);
                if(num==target){
                    // System.out.println("("+list.get(i)+" "+list.get(j)+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        // 1 2 3 4 5 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target =50;
       
        // System.out.println( pairsum(list,target));
         System.out.println(pair_sum(list,target));

    }
    
}

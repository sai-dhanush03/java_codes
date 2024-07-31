package B2_Array_list;
// find if any pair in a sorted and rotated AL has a target sum
// st 1: find out pivot point where sorted array is breaked
// bcoz here a[i] is always < a[i+1] where it violates it is breaking point
// refer @1hr:50 min in video
// for rotated fashion we use modulo arithmatic
// updations are lp=(lp+1)%n: rp=(n+rp-1)%n

import java.util.ArrayList;

public class A11_pair_sum2 {
    public static boolean pair_sum(ArrayList<Integer> list, int target){
        int bp=-1;//breaking point
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;//smallest
        int rp=bp;//largets
        int n=list.size();
        while(lp!=rp){
            int num=list.get(lp)+list.get(rp);
            if(num==target){
                return true;
                // System.out.println(list.get(lp)+" "+list.get(rp));


            }
            else if(num<target){
                lp=(lp+1)%n;
            }
            else{//num>target
                rp=(rp+n-1)%n;
            }
        }
        return false;
    }


    public static void main(String[] args) {
         ArrayList<Integer> list =new ArrayList<>();
        // 11 15 6 8 9 10 - sorted and rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target =160;
       
        // System.out.println( pairsum(list,target));
         System.out.println(pair_sum(list,target));
    }

}

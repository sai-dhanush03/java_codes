package B2_Array_list;

import java.util.ArrayList;
// import java.util.*;

public class A4_max_in_list {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
// O(n)
        int max=Integer.MIN_VALUE;
        for(int i=0; i<list.size();i++){
            // if(max<list.get(i)){
            //     max=list.get(i);
            // }  
                    //or
            max=Math.max(max,list.get(i));
        }

        System.out.println("Max elemnt in array list is: "+max);
    }
}

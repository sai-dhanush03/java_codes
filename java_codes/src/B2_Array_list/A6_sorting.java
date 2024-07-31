package B2_Array_list;
import java.util.Collections;
import java.util.*;

import java.util.ArrayList;

public class A6_sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(4);
        list.add(6); 
        System.out.println(list);
        Collections.sort(list);//gives ascending order
        System.out.println(list);

        // to get descending
        Collections.sort(list, Collections.reverseOrder());
        // comparator - fnx logic
        System.out.println(list);
    }
}

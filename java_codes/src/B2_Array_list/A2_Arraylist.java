package B2_Array_list;

import java.util.ArrayList;

public class A2_Arraylist {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
           
           list.add(1);
           list.add(2);
           list.add(3);
           list.add(4);
           list.add(5);

           //size of arraylist
           System.out.println(list.size());

           //prnt arraylist
           for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
           }

           System.out.println(list);
    }
}

package B2_Array_list;
import java.util.ArrayList;

public class A1_Arraylist {
    public static void main(String[] args) {
        //syntax
        // classname objname=new classname() //constructor calling
        // Java clctn frame work
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3= new ArrayList<>();

        // add elmnt O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        // it takse O(n)
        list.add(1,9);//by dis we can add element at specific index
                                    //without disturbing other nums all other nums shift one forward

        System.out.println(list);

        // get oprtn
        int ele = list.get(1);//1 indicates index
        System.out.println(ele);

        // remove O(n)
        list.remove(2);
        System.out.println(list);

        //set elmnt at indx
        list.set(2,10);
        System.out.println(list);

        // contains elemnt it checks whether that elemnt exist or not in that array list
        System.out.println(list.contains(2));
        System.out.println(list.contains(3));

    }

    
}

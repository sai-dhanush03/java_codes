package B10_Hashing;
import java.util.*;


public class H3_Linked_hashmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("china",200);
        lhm.put("us",50);

        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("china",200);
        hm.put("us",50);

        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("India",100);
        tm.put("China",200);
        tm.put("Us",50);
        tm.put("Indiaesia",55); 


        System.out.println(lhm+" linked hash map");//ordered gives o/p in the way we have given i/p
        System.out.println(hm);//unordered
        System.out.println(tm+" tree map");//sorted based on keys 

    }
    
}

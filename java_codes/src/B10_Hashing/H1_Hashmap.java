package B10_Hashing;
import java.util.*;
//basic overview of hash map

public class H1_Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();

        // inser O(1)

        hm.put("India",100);
        hm.put("china",150);
        hm.put("us",50);
        System.out.println(hm);

        // // get O(1)
        int population=hm.get("India");
        System.out.println(population); 

        // System.out.println(hm.get("Indonesia"));//returns null

        // // contains key O(1)
        // System.out.println(hm.containsKey("India"));//true
        // System.out.println(hm.containsKey("butan"));//false

        // // remove O(1)
        // System.out.println(hm.remove("china"));
        // System.out.println(hm.remove("indonesia"));
        // System.out.println(hm);

        // size
        System.out.println(hm.size());

        // IS EMT
        System.out.println(hm.isEmpty());//give false
        // clears everything
        hm.clear();
        System.out.println(hm.isEmpty());//now it gives true
    }
}

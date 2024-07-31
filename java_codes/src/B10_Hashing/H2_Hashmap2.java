package B10_Hashing;
import java.util.*;

public class H2_Hashmap2 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("china",150);
        hm.put("us",50);
        hm.put("uk",60);
        hm.put("sa",200);

        // Iterate
        // hm.entrySet();
        System.out.println(hm);
        // Set<String> keys=hm.keySet();
        // set<data type of key>
        // System.out.println(keys);//gives output in random order

        // for(String it:hm.keySet()){
        //     System.out.println(hm.get(it));
        // }

        for(Map.Entry<String,Integer> a:hm.entrySet()){
            System.out.println(a.getKey());

        }

        // for (String k : keys) {
        //     System.out.println("key= "+k+", value="+hm.get(k));
        // }
        
    }
}

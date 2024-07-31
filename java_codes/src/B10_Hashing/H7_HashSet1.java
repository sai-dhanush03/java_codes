package B10_Hashing;
import java.util.*;
// iterating over hash set
public class H7_HashSet1 {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("atp");
        cities.add("mum");
        cities.add("del");
        cities.add("kpd");

        // Iterator it=cities.iterator();//iterative approach
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // } or

        // for(String city : cities){ //enhanced for loop approach
        //      System.out.println(city);
        // }

        System.out.println(cities+" Hash set");

        LinkedHashSet<String> lhs=new LinkedHashSet<>();//it is ordered it gives o/p based on our i/p order
        lhs.add("atp");
        lhs.add("mum");
        lhs.add("del");
        lhs.add("kpd");

        lhs.remove("mum");

        // for()
        System.out.println(lhs+" Linked hash Set");

        TreeSet<String> ts=new TreeSet<>();
        ts.add("atp");
        ts.add("mum");
        ts.add("del");
        ts.add("kpd");

        System.out.println(ts+ " tree set");//gives o/p in sorted order


    }
}

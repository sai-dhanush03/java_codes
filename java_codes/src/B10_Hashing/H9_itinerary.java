package B10_Hashing;
import java.util.*;
// find the journey where it started and where it ended

public class H9_itinerary {
    public static String getStart(HashMap<String,String> tickets){//gives starting point
        HashMap<String,String> revMap=new HashMap<>();
        for(String key: tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }

        for(String key: tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;//starting point
            }
        }

        return null;


    }
    public static void main(String[] args) {
        HashMap<String,String> tickets=new HashMap<>();
        tickets.put("chennai","blr");
        tickets.put("mum","delhi");
        tickets.put("goa","chennai");
        tickets.put("delhi","goa");

        String start=getStart(tickets);
        System.out.print(start);
        for(String key:tickets.keySet()){
            System.out.print("-->"+tickets.get(start));
            start=tickets.get(start);
        }
    }
}

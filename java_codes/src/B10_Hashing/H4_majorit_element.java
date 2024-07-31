package B10_Hashing;
import java.util.*;
// find all ele that appear more than [n/3] times

public class H4_majorit_element {
    public static void majority(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            // if(map.containsKey(arr[i])){
            //     map.put(arr[i],map.get(arr[i])+1);
            // }else{
            //     map.put(arr[i],1);
            // }  or|
                 // v

            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);//if key is already present gives its value or else return default value
        }

        // iterateing over hashmap
        // Set<Integer> keySet=map.keySet();//we are storing keySet in new set we can also execute directly for reducing space

        for(Integer key: map.keySet()){//map.keySet() have all keys of the map
            if(map.get(key)>arr.length/3){
                System.out.println(key);
            }
        }


    }
     public static void main(String[] args) {
        int[] nums={1,3,2,5,1,3,1,5,1};
        majority(nums);

     }
}

package B10_Hashing;
// count distinct elements in an array 
// union and intersection of 2 array
import java.util.*;

public class H8_count_distinct {

    public static int count_distinct(int[] nums){
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        // System.out.println("ans = "+set.size());
        return set.size();

    }

    public static int[] union_intersec(int[] arr1, int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        // union
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        int union=set.size();

        // intersec
        set.clear();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }

        int intersection=count;
        int[] ans=new int[2];
        // ans={union,intersection};
        ans[0]=union;
        ans[1]=intersection;
        System.out.println(ans[0] +" " +ans[1]);

        // return new int[] {union,intersection};
        return ans;


    }
     public static void main(String[] args) {
        int nums[]={4,3,2,5,6,7,3,4,2,1};
        int[] arr1={7,3,9};
        int[] arr2={6,3,9,2,9,4};
        System.out.println(count_distinct(nums));
        // System.out.println(union_intersec(arr1, arr2));
        union_intersec(arr1, arr2);
        // System.out.println(ans[0]);


     }
}

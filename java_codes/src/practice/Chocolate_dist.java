package practice;
import java.util.*;

public class Chocolate_dist {
    public static int mindiff(int a[],int n,int m){
        int mindiff=Integer.MAX_VALUE;
        Arrays.sort(a);
        for(int i=0; i<=n-m;i++){
            int diff=a[i+m-1]-a[i];
            if(diff<mindiff){
                mindiff=diff;
            }


        }

        return mindiff;
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};

            int m = 5; // Number of students

                int n = arr.length;
System.out.println("Minimum difference is "
                 + mindiff(arr, n, m));
    }
}

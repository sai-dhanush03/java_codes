package B6_Greedy_Algorithms;
import java.util.Arrays;

public class G4_min_abs_diff {
    public static void main(String[] args) {
        int a[]={1,4,8,7};
        int b[]={2,3,6,5};

        Arrays.sort(a);
        Arrays.sort(b);

        int minDiff=0;

        for(int i=0;i<a.length;i++){
            minDiff+=Math.abs(a[i]-b[i]);
        }

        System.out.println("Min abs diff = "+minDiff);
    }
    
}

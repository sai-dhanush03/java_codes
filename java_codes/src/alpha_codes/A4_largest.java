package alpha_codes;
import java.util.*;
// largest num in an array
public class A4_largest {
    public static int getlargest(int num[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest= Integer.MAX_VALUE; // +infinity  

        for(int i=0; i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }

            if(smallest>num[i]){
                smallest=num[i];
            }
        }
        System.out.println("smallest is:"+smallest);
        return largest;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n =sc.nextInt();
        int num[]=new int[n];
        System.out.println("Enter nums");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        
        // int num[]={1,2,5,6,9,8,6};
        System.out.println("largest value is :"+ getlargest(num));
    }
}

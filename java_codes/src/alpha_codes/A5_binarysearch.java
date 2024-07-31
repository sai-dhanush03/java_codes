package alpha_codes;
import java.util.*;
public class A5_binarysearch {
    public static int binarysearch(int num[], int key){
        int start=0,end=num.length-1;

        while(start<=end){
            int mid=(start+end) / 2;

            //comparisions
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){ //right
                start=mid+1;
            }
            if(num[mid]>key){ //left
                end=mid-1;
            }
        }

        return -1;

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
        System.out.println("Enter key to be searced in the array:");
        int key = sc.nextInt();

        // int num[]={2,4,6,8,10,12,14};
        // int key=11;
        System.out.println("index for key is :"+ binarysearch(num,key));
    }
}

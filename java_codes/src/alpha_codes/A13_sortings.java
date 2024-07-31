package alpha_codes;
import java.util.*;

public class A13_sortings {


    // BUBBLE SORT
    public static void bubblesort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }

    // SELECTION pick the smallest from unsorted put it on the beginning

    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }

            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;

        }

    }

    // INSERTION pick an element from unsorted part and place in the right pos in sorted part.
    
    public static void insertion(int arr[]){
        for(int i=1; i<arr.length; i++){ 
            int curr = arr[i];
            int prev=i-1;
            // finding out the crct pos to insrt
            while(prev>=0 && arr[prev]> curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            // INSERTION
            arr[prev+1]= curr;
    }
}

// COUNTING SORT

    public static void countingsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }

        int count[] = new int[largest+1];
         for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
         }


        //  sortng
        int j=0;
        for(int i=0; i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

    }



        public static void printArr(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }

        public static void main(String[] args) {
            // int arr[]={5,4,1,3,2};
            int arr[]={1,4,1,3,2,4,3,7};
            bubblesort(arr);
            // selectionsort(arr);
            // insertion(arr);
            // countingsort(arr);

            // ***********IMP IMP IMP*************
            // Arrays.sort(arr); //DIRECT SORTING INBUIL FUNCTN 
            // Arrays.sort(arr,0,3);//FROM INDX TO INDX
            // Arrays.sort(arr,Collections.reverseOrder());
            // to make that work make int arr[] ------> Integer arr[] it only work on objects so
            printArr(arr);
        }
    }

package alpha_codes;
//search in a rotated sorted array the given input is rotated at one pivot

public class A43_rotated_sorted_array {
    
    public static int search(int arr[], int tar, int si, int ei){
        if(si>ei){//base case
            return -1;
        }

        // kaam
        int mid=si+(ei-si)/2; //(si+ei)/2

        // case found
        if(arr[mid]==tar){
            return mid;
        }

        // mid on L1
        if(arr[si]<=arr[mid]){
             // case a: left
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr, tar, si, mid);
            }
            else{
                // case b:right
                return search(arr,tar,mid+1,ei);
            }
           

        }

        // mid on L2
        else{
            // case c: right
            if(arr[mid]<=tar && tar<=ei){
                return search(arr,tar,mid+1,ei);
            }else{
                // case d : left
                return search(arr,tar,si,mid-1);
            }

        }
        // return -1; 

    }

    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int taridx=search(arr,target,0,arr.length-1);
        System.out.println(taridx);


        
    }
}



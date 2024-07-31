package alpha_codes;

public class A42_quicksort {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }   



    public static void quicksort(int arr[], int si, int ei){

        if(si>=ei){
            return;
        }
        // pivot as last element
        int pidx=partition(arr,si,ei);
        quicksort(arr,si,pidx-1);//left
        quicksort(arr,pidx+1,ei);//ri8
    }

    public static int partition(int arr[], int si, int ei){
        int pivot=arr[ei];
        int i=si-1;//to make place for elemnts smaller than pivot
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        //for getting pivot elemnt in the ri8 place
        int temp=pivot;
        arr[ei]=arr[i];//dont write pivot=arr[i]
        arr[i]=temp;
        return i;


    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        quicksort(arr,0,arr.length-1);
        printarr(arr);
    }
    
}

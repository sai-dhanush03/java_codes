package alpha_codes;

public class A41_merge_sort {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }   

    public static void mergesort(int arr[], int si, int ei){
        if(si==ei){ //their givn case is si<=ei
            return;
        }
        // kaam
        int mid= si+(ei-si)/2;//(si+ei)/2;
        mergesort(arr,si,mid);//left part
        mergesort(arr,mid+1,ei);//ri8 part
        merge(arr,si,mid,ei);

    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[]=new int[ei-si+1];
        int i=si;//iterator for left
        int j=mid+1;//iterator for ri8 part
        int k=0;//iterator for temp arr

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }
            else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        // for bacha hua part for left over elements in above case as
        //  there is and cndtn is prsnt if one gets completed oter wont execute so we are writing below while conditions.
    //    left part
        while(i<=mid){
            temp[k]=arr[i];
            i++;k++;
        }

        // ri8 part
        while(j<=ei){
            temp[k]=arr[j];
            j++;k++;
        }

        // copy temp arr to org arr
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5 };
        mergesort(arr,0,arr.length-1);
        printarr(arr);
    }
}

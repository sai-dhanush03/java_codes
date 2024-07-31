package alpha_codes;
public class A6_rev_array {
    public static void reverse(int num[]){
        int first=0;
        int last=num.length-1;

        while(first<last){
            //swap
            int temp = num[last];
            num[last]=num[first];
            num[first]=temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int num[]={5,8,4,3,2,11};

        reverse(num);
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    
}

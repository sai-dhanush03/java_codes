package alpha_codes;

public class A8_sub_array {
    public static void sub_arrays(int num[]){
        int ts=0;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){ //to print
                    System.out.print(num[k]+" "); // sub array
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total pairs: "+ts);
    }

    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        sub_arrays(num);
    }
}

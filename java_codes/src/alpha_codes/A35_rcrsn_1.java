package alpha_codes;

//   prnt n to 1(dec order)
public class A35_rcrsn_1 {
    public static void printdec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printdec(n);

    } 
}

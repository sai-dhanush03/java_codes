package alpha_codes;

public class A40_binary_string {
    // print all binary strings of size "N" without consecutive ones.

    public static void printBinaryStrings(int n, int lastplace, String str){

        // base case
        if(n==0){
            System.out.println(str);
            return;
        }

        // kaam
        if(lastplace==0){
            // sit 0 on chair n 
            printBinaryStrings(n-1,0,str+"0");
            printBinaryStrings(n-1,1,str+"1");
            
        }
        else{
            printBinaryStrings(n-1,0,str+"0");
        }
    }

    public static void main(String[] args) {
        printBinaryStrings(3,0,"");
    }
    
}

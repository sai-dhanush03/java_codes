package alpha_codes;
// Total 10 prblms based on recursion
// print num from 1 to n(inc order)
public class A36_rcrsn_2 {

    public static void printinc(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        printinc(n-1);
        System.out.print(n+" ");
    }



    public static int factorial(int n){
        if(n==0){
            return 1;
        }

        // int fnm1=factorial(n-1);
        // int fact=n*fnm1;

        int fact=n*factorial(n-1);
        return fact;
    }



    public static int calcsum(int n){
        if(n==1){
            return 1;
        }
        int snm1=calcsum(n-1); //it reprsnts sum of n-1 ==> sum(n-1)
        int sum=n+snm1;
        return sum;
    }



    public static int fibonacci(int n){
        // if(n==0){
        //     return 0;
        // }
        // else if(n==1){
        //     return 1;
        // }  
        // or

        if(n==0||n==1){
            return n;
        }

        int fib_nm1=fibonacci(n-1);
        int fib_nm2=fibonacci(n-2);
        int fib_n= fib_nm1  +  fib_nm2;
        return fib_n;
        
    }



    public static boolean issorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){

            return false;
        }

        return issorted(arr,i+1);
    }





    public static int firstoccurance(int arr[],int key, int i){
        if(i==arr.length){
            System.out.println("not found");
            return -1;
        }
        if(arr[i]==key){
            return i;
        }

        return firstoccurance(arr,key,i+1);
    }







    public static int lastOccurance(int arr[],int key, int i){

        if(i==arr.length){
            return -1;
        }
        int isfound= lastOccurance(arr,key,i+1);
        
        if(isfound==-1 && arr[i]==key){
            return i;
        }

        return isfound;
    }







    public static int x_pwr_n(int x, int n){
        // if(n==0){
        //     return 1;
        // }
        //or

        if(n==1){
            return x;
        };

        int x_pwr_nm1= x_pwr_n(x,n-1);
        int exp=x* x_pwr_nm1;
        return exp;
        // here time = O(n) in opt ver time = O(log n)
        // for optimized version refer below 
    }

    public static int  optimizedPower(int x, int n){
        if(n==0){
            return 1;
        }

        // int halfPowersq= optimizedPower(x,n/2)*optimizedPower(x,n/2);
        // still its O(n) to make it O(log n) refer below becoz here in up 2 seperate functions are calling whcih affect computation time so do as below  

        int halfPower=optimizedPower(x,n/2);
        int halfPowersq= halfPower*halfPower;

        // if n is odd
        if(n%2!=0){
            halfPowersq=x*halfPowersq;
        }

        return halfPowersq;
    }



    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5,6};
        // int arr[]={8,3,6,9,5,10,2,5,3};
        // int arr[]={1,2,5,6,5,5,5,5,5};
        // int n=10;
        // printinc(10);
        // System.out.print(factorial(9));
        // System.out.println(calcsum(5));
        // System.out.println(fibonacci(6 ));
        // System.out.println(issorted(arr,0));
        // System.out.println(firstoccurance(arr,25,0));
        // System.out.println(lastOccurance(arr,5,0));
        // System.out.println(x_pwr_n(2,10));
        System.out.println(optimizedPower(2,10));

    }
    
}

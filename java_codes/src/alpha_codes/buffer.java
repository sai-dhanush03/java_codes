package alpha_codes;

public class buffer {
    public static void reverseWord(String str)
    {
       int n=str.length();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
           a[i]=str.charAt(i);
       }
       System.out.println(a[0]);

       for(int i=0;i<n/2;i++){
        int temp=a[i];
        a[i]=a[n-1-i];
        a[n-1-i]=temp;
       }

       for(int i=0;i<n;i++){
        System.out.print(a[i]);
       }
    //    return str;
    }
    public static void main(String[] args) {
        String s="abcd";
        reverseWord(s);
        // System.out.println(reverseWord(s));
    }
}

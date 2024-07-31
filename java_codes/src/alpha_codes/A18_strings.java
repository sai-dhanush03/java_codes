package alpha_codes;
import java.util.*;


public class A18_strings {

    public static void printletters(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+",");
            count++;
        }
        System.out.println("\n"+count);
    }
    public static void main(String[] args) {
       
        // char arr[]={'a','b','c','d'};
        // String str="abcd";
        // String str1=new String("xyz");

        // // Strings are immutble
        // System.out.println(str);
        // System.out.println(str1); 

        // Scanner sc=new Scanner(System.in);
        // String name;
        // name=sc.nextLine();//nextLine takes the input of whole line
        // System.out.println(name);

        // String fullname= "Sai dhanush";
        // System.out.println(fullname.length());

        // concatenation

        // String firstname="sai ";
        // String lastname="Dhanush";
        // String fullname1=firstname+lastname;
        // System.out.println(fullname1);
        // System.out.println(fullname1.charAt(0));
        // printletters(fullname1);
        
        // == wont work always while comparing strings
        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");

        if(s1==s2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }

          if(s1==s3){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }

        if(s1.equals(s3)){

         System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}

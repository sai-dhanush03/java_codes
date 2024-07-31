package alpha_codes;

public class A22_string_functns {
    public static String substr(String str, int si, int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        // substrng
    //     String str="Hello World";
    //   System.out.println(  str.substring(0,5));
        // System.out.println(substr(str,0,5));
        String fruits[]={"apple","mango","banana"};
        String largest=fruits[0];
        for(int i=0; i<fruits.length;i++){

            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);



    }
}

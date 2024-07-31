package alpha_codes;

public class A33_static {
    public static void main(String[] args) {
        student1 s1 = new student1();
        s1.sclname="vit";

        student1 s2= new student1();
        System.out.println(s2.sclname);

        student1 s3= new student1();
        s3.sclname="tiv";
        System.out.println(s1.sclname);
    }
}

class student1 {
    String name;
    int roll;

    static String sclname;

    void setName(String name){
        this.name=name;
    }

    String getName(){
        return this.name;
    }
}
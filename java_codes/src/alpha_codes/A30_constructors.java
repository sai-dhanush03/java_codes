package alpha_codes;

public class A30_constructors {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="sai";
        s1.roll=12;
        s1.pass="ab";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s4=new Student(s1);//copy
        s4.pass="asa";
        s1.marks[2]=100;

        for(int i=0; i<3;i++){
            System.out.println(s4.marks[i]);
        }

       
       
        // student s2=new student("sai");
        // student s3=new student(12);
        // System.out.println(s1.name);

        


    }
}

class Student{
    String name;
    int roll;
    String pass;
    int marks[];


    // shallow copy constructor
    // student(student s1){
    //     marks=new int[3];

    //     this.name=name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    // }

    // deep copy const
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }

    }

    Student(){
        marks=new int[3];
       System.out.println(" const is called....");
    // this.name=name;
    }

    Student(String name){
        this.name=name;
        marks=new int[3];
    }

    Student(int roll){
        marks=new int[3];
        this.roll=roll;
    }
}

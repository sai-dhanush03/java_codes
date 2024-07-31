package alpha_codes;

public class A28_oops {

    public static void main(String[] args) {
        Pen p1= new Pen();//created a pen obj p1 
        p1.setcolor("Blue");
        System.out.println(p1.getcolor());
        p1.settip(5);
        System.out.println(p1.gettip());

        p1.setcolor("yellow");
        System.out.println(p1.getcolor());
    }
    
}

class Pen { //class name capital starting
   private String color;
    private int tip;
    String getcolor(){
        return this.color;
    }

    int gettip(){
        return this.tip;
    }

    void setcolor(String newclr){
        this.color = newclr;
    }

    void settip(int tip){
        this.tip=tip;//this.tip refers to that specific obcts property tip
                     //where rhs tip refers to arg passed in settip
    }

}


// class Student{
//     String name;
//     int age;
//     float percnt;

//     void percent(int phy, int mat, int che){
//         percnt=(phy+che+mat)/3;
//     }
// }

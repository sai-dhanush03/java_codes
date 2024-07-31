package alpha_codes;

public class A34_super {
    public static void main(String[] args) {
        Horse h=new Horse();
        System.out.println(h.clr);
        
    }    
}

class animals{
    String clr;
    animals(){
        System.out.println("animals const is called");
    }
}

class Horse extends animals{
    Horse(){
        super.clr="brown";
        System.out.println("horse const is called");
    }
}

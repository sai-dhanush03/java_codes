package alpha_codes;

public class A31_Inheritence {
    public static void main(String[] args) {
        // fish shark = new fish();
        // shark.eat();
        // dog doggy=new dog();
        // doggy.eat();
        // doggy.legs=4;
        // System.out.println(doggy.legs);
        // doggy.breed="sizu";
        // System.out.println(doggy.breed);
        dog honey=new dog();//observe the way hor constructors are being called
        // animal-->mammals->dogs 

    }
    
}

// base class
class animal{
    String clr;

    animal(){
        System.out.println("animal constructor is called");
    }
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}


// derived class
// class fish extends animal{
//     int fins;

//     void swim(){
//         System.out.println("swims in water");
//     }
// }

class mammals extends animal{
    mammals(){
        System.out.println("mammal cnstrctr is called");
        
    }
    int legs;
}

class dog extends mammals{
    dog(){
        System.out.println("dog cnstctr is called");
    }
    String breed;
}

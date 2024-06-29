
public class MultilevelInheritance {
    public static void main(String[] args) {
       
        Puppy puppy = new Puppy() ; 

        puppy.eat() ; 
        puppy.bark();
        puppy.weep(); 

    }    
}

class Animal {
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}

class Puppy extends Dog{
    void weep(){
        System.out.println("Weeping");
    }
}

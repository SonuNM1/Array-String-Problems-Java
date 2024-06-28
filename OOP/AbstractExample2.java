package OOP;

public class AbstractExample2 {
    public static void main(String[] args) {
        
        Cat cat = new Cat() ; 
        cat.makeSound(); 

    }
}

interface Animal {
    void makeSound() ; // abstract method
}

class Cat implements Animal{

    // implementing the interface mthod

    public void makeSound(){
        System.out.println("Meow");
    }

}

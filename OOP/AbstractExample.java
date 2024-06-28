package OOP;

public class AbstractExample {
    public static void main(String[] args) {
       
        Dog dog = new Dog() ; 

        dog.makeSound();
        dog.sleep();

    }
}

abstract class Animal {

    // abstract method (doesn't have a body)

    abstract void makeSound() ; 

    // Concrete method 

    void sleep(){
        System.out.println("Sleeping....");
    }

}

class Dog extends Animal {

    // implementing the abstract method 

    void makeSound(){
        System.out.println("Woof...");
    }

}

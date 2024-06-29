

public class AbstractClass {
    public static void main(String[] args) {
        
     //   Animal animal = new Animal() ; // Compile-time error: Animal is abstract ; cannot be instantiated

     // creating an instance of the dog class 

     Dog dog = new Dog() ; 

     dog.makeSound();
     dog.sleep();

    }
}

abstract class Animal{
    
    // abstract method (no implementation)

    abstract void makeSound() ; 

    // Concrete method (with implementation)

    void sleep(){
        System.out.println("Sleeping");
    }
}

// subclas of Animal 

class Dog extends Animal{
    // providing implementation for the abstract method 
    void makeSound(){
        System.out.println("Woof...");
    }
}
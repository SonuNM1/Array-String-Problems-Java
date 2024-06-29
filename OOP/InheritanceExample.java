

public class InheritanceExample {
    public static void main(String[] args) {
        
        // Creating an object of the parent class 

        Animal animal = new Animal("Generic Animal") ; 

        animal.makeSound(); // Output-> Some generic animal sound 
        animal.displayInfo(); // Output-> Animal name: Generic Animal 

        // creating an object of the Child class 

        Dog dog = new Dog("Buddy") ; 

        dog.makeSound(); // Woof
        dog.displayInfo(); // Animal name:  Buddy

    }
}

// defining a parent class named Animal 

class Animal{

    String name ; // instance variable 

    // Constructor 

    Animal(String name){
        this.name = name ; 
    }

    // method to make sound 

    void makeSound(){
        System.out.println("Some generic animal sound");
    }

    // method to display animal name 

    void displayInfo(){
        System.out.println("Animal name: " + name);
    }
}

// defining a child class named Dog that extends Animal 

class Dog extends Animal {

    // Constructor 

    Dog(String name){
        super(name) ; // calling the constructor of the parent class 
    }

    // Overriding the makeSound method 

    @Override 

    void makeSound(){
        System.out.println("Woof...");
    }

    // adding a new method specific to Dog 

    void wagTail(){
        System.out.println(name + " is wagging its tail");
    }

}
package Concepts;

public class InheritanceExample {
    public static void main(String[] args) {
        
        Dog dog = new Dog() ; 
        dog.eat() ; // inherited method
        dog.bark(); // subclass method

    }    
}

// superclass 

class Animal{
    void eat(){
        System.out.println("This animal eats food");
    }
}

// subclass 

class Dog extends Animal{
    void bark(){
        System.out.println("This dog barks");
    }
}

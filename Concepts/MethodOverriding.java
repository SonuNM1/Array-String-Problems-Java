package Concepts;

public class MethodOverriding {
    public static void main(String args[]){

        Animal myAnimal = new Animal() ; 
        Animal myDog = new Dog() ; 

        myAnimal.makeSound();
        myDog.makeSound();

    }
}

class Animal{
    // method to be overriden
    public void makeSound(){
        System.out.println("Animal makes a sound"); 
    }
}

class Dog extends Animal{
    // overriding the makeSound method

    @Override

    public void makeSound(){
        System.out.println("Dog barks");
    }
}
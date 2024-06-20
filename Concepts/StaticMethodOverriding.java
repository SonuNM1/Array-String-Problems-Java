package Concepts ; 

public class StaticMethodOverriding{
    public static void main(String[] args) {
        
        Parent.display(); // calls the static method in parent class 
        Child.display() ; // calls the static method in child class 

        Parent obj = new Child() ; 
        obj.display();

    }
}

class Parent{
    
    // static method in the superclass 

    public static void display(){
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent{

    // static method in the subclass with the same signature 

    public static void display(){
        System.out.println("Static method in Child class");
    }
}
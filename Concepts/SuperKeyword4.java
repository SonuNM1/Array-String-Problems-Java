package Concepts;

public class SuperKeyword4 {
    Child c1 = new Child();
    Child c2 = new Child(10) ; 
}

class Parent{
    Parent(){
        System.out.println("Parent constructor");
    }
    Parent(int x){
        System.out.println("Parent constructor with value: " + x);
    }
}

class Child extends Parent{
    Child(){
        super() ; // calls the no-argument constructor of Parent 
    }
    Child(int x){
        super(x) ; // calls the parameterized constructor of Parent
        System.out.println("Child constructor with value: " + x);
    }
}

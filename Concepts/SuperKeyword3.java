package Concepts;

public class SuperKeyword3 {
    public static void main(String[] args) {
        
        Child c = new Child() ; 
        c.show();
        
        Parent obj = new Parent() ; 
        obj.display() ; 

    }
}

class Parent{
    void display(){
        System.out.println("Parent display()");
    }
}

class Child extends Parent{
    
    void display(){
        System.out.println("Child display()");
    }

    void show(){
        super.display(); // calls the display method of Parent class 
    }
}
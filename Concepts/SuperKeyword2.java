package Concepts;

public class SuperKeyword2 {
    public static void main(String[] args) {
        
       Child c = new Child();
       c.show() ;  

    }
}

class Parent{
    int x = 10 ; 

    void display(){
        System.out.println("Parent display()");
    }
}

class Child extends Parent{
    int x = 20 ; 

    void display(){
        System.out.println("Child display()");
    }

    void show(){
        System.out.println("x in Child: " + x);
        System.out.println("X in Parent: " + super.x );
        super.display();
    }

}

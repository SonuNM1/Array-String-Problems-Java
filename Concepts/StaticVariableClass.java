package Concepts;

public class StaticVariableClass {
    public static void main(String[] args) {
        
        Example obj1 = new Example();
        Example obj2 = new Example() ; 

        obj1.display(); // output: Static variable - 2
        obj2.display() ; // output: Static variable - 2

        // changing staticVar via obj1

        obj1.staticVar = 10 ; 

        obj1.display(); // output: static variable - 10
        obj2.display(); // output: static variable - 10

    }
}

class Example{
    static int staticVar = 0;

    public Example(){
        staticVar++ ; 
    }

    public void display(){
        System.out.println("Static variable: "+ staticVar);
    }
}

package Concepts;

public class StaticClass2 {
    
    public static void main(String[] args) {
        
        OuterClass.NestedStaticClass obj = new OuterClass.NestedStaticClass() ; 

        obj.display();

    }

}

class OuterClass{
    private int instanceVar = 10 ; 
    private static int staticVar = 20 ; 

    // Static nested class 

    public static class NestedStaticClass{
        
        public void display(){

            // can access static members of the outer class 

            System.out.println("Static variable: " + staticVar);

            // cannot access instance members of the outer class 

            /* System.out.println("Instance variable: " + instanceVar); */

        }

    }

}

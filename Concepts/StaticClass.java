package Concepts;

public class StaticClass {
   
    public static void main(String[] args) {
        
        OuterClass.NestedStaticClass obj = new OuterClass.NestedStaticClass() ; 

        obj.display();
    }
}

class OuterClass{
    static int outerStaticVar = 10 ; 

    // Static nested class 

    public static class NestedStaticClass{

        public void display(){
            System.out.println("Static nested class: " + outerStaticVar);
        }
    }
}

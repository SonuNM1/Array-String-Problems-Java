package Concepts;

public class StaticMethodsOverload {
      public static void main(String[] args) {
        
        // calling overloaded static methods 

        Example.display(); // calls the method no parameters

        Example.display(10); // calls the method with one integer parameter

        Example.display(10, 20); // calls the method with two int parameters

        Example.display("Sonu NM"); // calls the method with one string parameter

      }
}

class Example{

    // first static method with no parameter
    
    public static void display(){
        System.out.println("displaying with no parameters");
    }

    // overloaded static method with one integer parameter

    public static void display(int a){
        System.out.println("displaying with one parameter: " + a);
    }

    // overload static method with two parameters 

    public static void display(int a, int b){
        System.out.println("Displaying with two parameters: " + a + ", " + b);
    }

    // overload static method with one string parameter

    public static void display(String message){
        System.out.println("Display with a message: " + message);
    }

}
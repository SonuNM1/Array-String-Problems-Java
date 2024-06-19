package Concepts;

public class MethodOverloading {
    
    // method with one int parameter 

    public void display(int a){
        System.out.println("Method with one int parameter: " +a );
    }

    // method with one string parameter

    public void display(String a){
        System.out.println("Method with one string parameter: " + a);
    }

    // method with two int parameters

    public void display(int a, int b){
        System.out.println("Method with two int parameters: " + a + ", " + b) ; 
    }

    // method with one int and one string parameter
    
    public void display(int a, String b){
        System.out.println("Method with one int and String parameter: "+a+", "+b);
    }

    public static void main(String args[]){
        MethodOverloading obj = new MethodOverloading() ; 

        obj.display(10);
        obj.display("Hello");
        obj.display(10, 20);
        obj.display(30,"World");
    }

}

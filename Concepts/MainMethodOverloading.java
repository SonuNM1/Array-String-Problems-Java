package Concepts;

public class MainMethodOverloading {

        // Standard main method 
    public static void main(String args[]){

    System.out.println("Standard main method");

    // calling overloaded main methods 

    main(10) ; 
    main("Hello world") ; 
    main(20,30) ; 

    }

    // overloaded main method with an int parameter 

    public static void main(int number){
        System.out.println("Overloaded main method with int: " + number) ; 
    }

    // Overloaded main method with a String parameter

    public static void main(String message){
        System.out.println("Overloaded main method with String: " + message) ; 
    }

    // Overloaded main method with two int parameters

    public static void main(int num1, int num2){
        System.out.println("Overloaded main method with two ints: " + num1+ ", " + num2);
    }
}

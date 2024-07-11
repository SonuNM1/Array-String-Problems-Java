
public class FactorialNumber{
    public static void main(String[] args) {
        int num = 5 ; 
        System.out.println("Factorial of "+ num + " is: " + factorial(num));
        
    }

    public static int factorial(int num){
        if(num < 0){
            throw new IllegalArgumentException("Number must be non-negative"); 
        }
        int factorial = 1 ; 

        for(int i=1 ; i <= num ; i++){
            factorial *= i ; 
        }
        return factorial ; 
    }
}


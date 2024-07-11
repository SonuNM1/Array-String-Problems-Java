
public class FactorialRecursive {
    public static void main(String[] args) {
        int num = 5 ; 
        System.out.println("Factorial of "+ num + " is: " + factorial(num));
    }    

    public static int factorial(int num){
        if(num < 0){
            throw new IllegalArgumentException("Number must be non-negative") ; 
        }
        if(num == 0 || num == 1){
            return 1 ; 
        }

        return num*factorial(num-1) ; 
    }
}

/*

public static int factorial(int num){
    if(num < 0){
        throw new IllegalArgumentException("Number must be non-negative") ; 
    }
    if(num == 0 || num == 1){
        return 1 ; 
    }
    return num*factorial(num-1) ; 
}

 */
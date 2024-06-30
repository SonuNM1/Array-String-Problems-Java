package TryCatch;

public class TryCatch2 {
    public static void main(String[] args) {
        
        // declare and initialize variables 

        int a = 40 ; 
        int b = 0 ; 
        int[] arr = {1 , 2 , 3} ; 

        try{
            // attempt to divide by zero
            int c = a/b ; // this will throw an ArithmeticException 
            System.out.println("Result of division: " + c);

            // attempt to access an array index that doesn't exist 
            int d = arr[3] ; 
            System.out.println("Array element: " +d );
        }
        catch(ArithmeticException e){
            // handle ArithmeticException
            System.out.println("ArithmeticException: Cannot divide by 0");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: Array index out of bound");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Exception: An error occurred");
            System.out.println(e);
        }
        finally{
            // code that will always execute 
            System.out.println("Finally block");
        }

    }
}

package Concepts;

public class finallyExample {
    public static void main(String args[]){

        try{
            int result = 10/0 ;
        } catch(ArithmeticException e){
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        }finally{
            System.out.println("This will always execute");
        }
    }
}

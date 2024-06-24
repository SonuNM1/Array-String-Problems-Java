package Concepts;

public class PassByValue {
    public static void main(String args[]){

        int num = 10 ; 
        modifyPrimitive(num);
        System.out.println("After modifying primitive: " + num); // output -> 10 

    }
    
    public static void modifyPrimitive(int n){
        n = 20 ; 
    }

}

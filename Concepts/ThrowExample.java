package Concepts;

public class ThrowExample {
    public static void main(String[] args) {
        
        try{
            checkAge(9);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("Age must be atleast 18") ; 
        } else {
            System.out.println("Age is valid");
        }
    }

}


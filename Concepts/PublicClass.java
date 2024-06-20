package Concepts;

public class PublicClass {

    public int publicVariable = 10; 

    public void publicMethod(){
        System.out.println("Public method");
    }

    public static void main(String args[]){

        PublicClass obj = new PublicClass() ; 
        
        System.out.println(obj.publicVariable);
        
        obj.publicMethod();

    }
}

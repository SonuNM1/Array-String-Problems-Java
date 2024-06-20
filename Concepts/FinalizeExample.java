package Concepts;

public class FinalizeExample {
    
    @Override

    // overriding the finalize method from the Object class 

    protected void finalize() throws Throwable{
        System.out.println("Finalize method called") ; 
        super.finalize();
    }

    public static void main(String args[]){
        FinalizeExample obj = new FinalizeExample() ; 
        obj = null ; // making the object eligible for garbage collection by setting it to null

        System.gc();  // suggesting JVM to run garbage collector
    }
}

package Concepts;

public class FinalClass {
    public static void main(String[] args) {
        FinalClassExample obj = new FinalClassExample() ;
        obj.display();
    }
}

final class FinalClassExample{
    public void display(){
        System.out.println("This is a final class") ; 
    }
}
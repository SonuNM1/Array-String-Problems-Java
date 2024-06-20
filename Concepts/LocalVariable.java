package Concepts;

public class LocalVariable {

    public void display(){
        int localVar = 10 ; // local variable
        System.out.println("Local variable: " + localVar);
    }

    public static void main(String[] args) {
        LocalVariable obj = new LocalVariable() ; 
        obj.display();
    }
}


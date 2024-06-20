package Concepts;

public class FinalMethod {
    public static void main(String[] args) {
        Child obj = new Child() ; 
        obj.display() ; 
    }
}

class Parent{
    public final void display(){
        System.out.println("This is a final method");
    }
}

class Child extends Parent{
/*   public void display(){
        System.out.println("Cannot override final method");
    }
*/
}

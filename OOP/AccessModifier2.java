/*          // PUBLIC access modifier


class Example{
    private int data = 10 ; // private variable 

    private void display(){ // private method
        System.out.println("Private method");
    }

    public void publicMethod(){
        display();  // accessing private method within the same class 
    }
}

public class AccessModifier2{
    public static void main(String[] args) {
        
        Example obj = new Example(); 
        obj.publicMethod(); 

    }
}
*/


            // DEFAULT access modifier

 /*            
public class AccessModifier2{
    public static void main(String[] args) {
        
        Example obj = new Example() ; 
        obj.data = 20 ; 
        obj.display();

    }
}

class Example{
    int data = 10 ; // default access variable 

    void display(){  // default access method
        System.out.println("Default method");
    }
}
    */


                // PROTECTED access modifier


public class AccessModifier2{
    public static void main(String[] args) {
        
    }
}

class Example{
    protected int data = 10 ; // protected variable 

    protected void display(){     // protected method
        System.out.println("Protected method");
    }
}

class Subclass extends Example{
    public void accessProtected(){
        
    }
}

public class SuperKeyword2 {
    public static void main(String[] args) {
        
    }    
}

class Base{
    Base(){
        System.out.println("i am a base class constructor");
    }
    Base(int x){
        System.out.println("I am an overloading base class constructor with x as an value: " + x);
    }
}

class Derived extends Base{
    Derived(){
        System.out.println("i am a derived class constructor");
    }
    Derived(int x, int y){
        super(x) ; // will call the parametrized constructor of the base class 
        System.out.println("i am an overloaded derived class constructor with the value of y as: " + y );
    }
}
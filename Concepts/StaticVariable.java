package Concepts;

public class StaticVariable {

    private static int staticVar ; // static variable

    public StaticVariable(int value){
        staticVar = value ; 
    }

    public void display(){
        System.out.println("Static variable: " +  staticVar);
    }

    public static void main(String[] args) {
        
        StaticVariable obj = new StaticVariable(30) ; 
        obj.display() ; 

        StaticVariable obj2 = new StaticVariable(40) ; 
        obj2.display();

    }
}

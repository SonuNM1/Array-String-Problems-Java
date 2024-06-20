package Concepts;

public class InstanceVariable {

    private int instanceVar ; // instance variable

    public InstanceVariable(int value){
        this.instanceVar = value ; 
    }

    public void display(){
        System.out.println("Instance variable: " + instanceVar);
    }

    public static void main(String[] args) {
        
        InstanceVariable obj = new InstanceVariable(20) ; 
        obj.display();

    }   
}

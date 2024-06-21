package Concepts; 

public class StaticVariableExample{
    static int staticVar = 10; // static variable 

    public void instanceMethod(){
        System.out.println("Instance method: " + staticVar);
    }

    public static void main(String[] args) {
        
        // creating instance of the class 

        StaticVariableExample obj = new StaticVariableExample() ; 

        StaticVariableExample obj2 = new StaticVariableExample() ; 

        // both obj1 and obj2 share the same static variable 

        obj.staticVar = 20 ; 

        // printing the value of staticVar using obj2

        System.out.println(obj2.staticVar); // output: 20

        // demonstrating the instance method 

        obj.instanceMethod();
        obj2.instanceMethod();


    }


}
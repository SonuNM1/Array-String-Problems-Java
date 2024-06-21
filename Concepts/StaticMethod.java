package Concepts;

public class StaticMethod {

    static int staticVar = 10;

    public static void staticMethod(){
        System.out.println("Static method: " + staticVar);
    }

    public void instanceMethod(){
        System.out.println("Instance method: " + staticVar);
    }

    public static void main(String[] args) {
        
        StaticMethod.staticMethod(); // calls the static method directly

    }
}

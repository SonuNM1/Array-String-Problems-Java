public class LambdaExpression {
    public static void main(String[] args) {
        
        // using lambda expression to implement the sayHello method 

        MyFunctionalInterface greeting =()->{
            System.out.println("Hello");
        } ; 

        greeting.sayHello();

    }
}

@FunctionalInterface

interface MyFunctionalInterface{
    void sayHello() ; 
}


public class AnonymousClass{
    public static void main(String[] args) {
        
        Greeting greeting = new Greeting() {
            @Override
            void sayHello(){
                System.out.println("Hello");
            }
        };
        greeting.sayHello();
    }
}

interface Greeting{
    void sayHello() ; 
}
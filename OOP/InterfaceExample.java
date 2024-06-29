

public class InterfaceExample {
    public static void main(String[] args) {
        
        // Creating an instance of the Cat class 

        Cat cat = new Cat() ; 
        cat.makeSound(); 

    }
}

interface Animal {
    void makeSound() ; // abstract method
}

// implementing the interface 

class Cat implements Animal{

    // Providing implementation for the interface method 

    public void makeSound(){
        System.out.println("Meow...");
    }
}

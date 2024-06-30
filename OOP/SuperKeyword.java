public class SuperKeyword {
    public static void main(String[] args) {
        
        Dog dog = new Dog("buddy") ; 
        

    }
}

// superclass Animal with a parametrized constructor 

class Animal {
    private String name ; 

    // parametrized constructor of Animal class 

    public Animal(String name){
        this.name = name ; 
        System.out.println("Animal is created: " + animal);
    }

    // getter for name

    public String getName(){
        return name ; 
    }
}

class Dog extends  Animal{

    // constructor of dog class 

    public Dog (String name){

        // call to the parametrized constructor of the superclass 

        super(name) ; 
        System.out.println("Dog is created: " + name);

    }

}



public class MethodOverriding{
    public static void main(String[] args) {
        
        // Creating an array of Animal references 

        Animal[] animals = {new Dog(), new Cat(), new Animal()} ; 

        // loop through the array and call makeSound on each animal 

        for(Animal animal: animals){
            animal.makeSound() ; 
        }

    }
}

// Parent class Animal

class Animal{

    // method to make a sound 

    void makeSound(){
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal{

    // Overriding the makeSound method 

    @Override 

    void makeSound(){
        System.out.println("Woof") ; 
    }
}

class Cat extends Animal{

    // overriding the makeSound method 

    @Override 

    void makeSound(){
        System.out.println("Meow") ; 
    }

}
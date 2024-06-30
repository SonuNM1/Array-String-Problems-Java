
public class HierarchicalInheritance {
    public static void main(String[] args) {
    
        Dog dog = new Dog() ; 
        Cat cat = new Cat() ; 

        dog.eat();
        dog.bark();

        cat.eat();
        cat.meow();

    }
}

class Animal{
    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Meowing");
    }
}
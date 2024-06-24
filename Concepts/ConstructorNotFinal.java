package Concepts;

public class ConstructorNotFinal {
    public static void main(String[] args) {
        
        // create an object using the constructor with name and age 

        Person person1 = new Person("Alice", 30) ; 
        System.out.println("Person 1: " + person1.getName() + ", Age: " + person1.getAge());

        // create an object using the constructor with just a name 

        Person person2 = new Person("Bob") ; 
        System.out.println("Person 2: " + person2.getName() + ", Age: " + person2.getAge());

        // create an object using the default constructor 

        Person person3 = new Person() ; 
        System.out.println("Person 3: " + person3.getName() + ", Age: " + person3.getAge());

    }
}

class Person{
    
    // Instance variables 
    
    private String name; 
    private int age; 

    // Constructor: initializes the object with name and age

    public Person(String name, int age){
        this.name = name ; // set the name  
        this.age = age ; // set the age 
    }

    // Constructor: initializes the object with just a name, default age 

    public Person(String name){
        this.name = name ; // set the name 
        this.age = 0 ; // set the default age to 0 
    }

    // default constructor: initializes with default values 

    public Person(){
        this.name = "Unknown" ; // default name 
        this.age = 0 ; // default age 
    }

    // getter for name 

    public String getName(){
        return name ; 
    }

    // getter for age

    public int getAge(){
        return age ; 
    }
    
}

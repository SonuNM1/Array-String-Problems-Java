public class ConstructorOverloading {
    public static void main(String[] args) {
        
        // using constructor with all parameters 

        Person person1 = new Person(
            "Sonu NM" , 24, "Badarpur"
        ) ; 

    }
}

class Person{
    
    String name ; 
    int age ; 
    String address ; 

    // Constructor with all parameters

    Person(String name, int age, String address){
        this.name = name ; 
        this.age = age ; 
        this.address = address ; 
    }

    // Constructor with name and age, address is default 

    Person(String name, int age){
        this.name = name ; 
        this.age = age ; 
        this.address = "Unknown" ; // default address 
    }

    // constructor with name only, age and address are default 

    Person(String name){
        this.name = name ; 
        this.age = 0 ; // default age  
        this.address = "Unknown" ; // default address 
    }

    // Default constructor, all attributes are default 
    
    Person(){
        this.name = "Unknown" ; // default name 
        this.age = 0 ; // default age 
        this.address = "Unknown" ; // default address 
    }

    // method to display the details

    void display(){
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }

}


/* 

            // Without Constructors 

public class ConstructorImportance {
    public static void main(String[] args) {
        
        // create a new person object 

        Person p = new Person() ; 

        // manually set the attributes 

        p.name = "Sonu NM" ; 
        p.age = 24 ; 

        System.out.println("Name: " + p.name + ", Age: " + p.age);

    }   
}

class Person{
    String name ; 
    int age ; 
}

*/

public class ConstructorImportance{
    public static void main(String[] args) {
        
        // create a new person object using the constructor 

        Person p = new Person("Sonu NM", 24) ; 

        System.out.println("Name: " + p.name + ", Age: " + p.age);

    }
}

class Person{
    String name ; 
    int age ; 

    // Constructor to initialize the object 

    Person(String name, int age){
        this.name = name ; 
        this.age = age ; 
    }

}

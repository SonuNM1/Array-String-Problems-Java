
public class Encapsulation {
    public static void main(String[] args){

        Person person = new Person("Sonu NM", 24) ; 

        // Accessing fields via public methods 

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // modifying fields via public methods 

        person.setName("Sonu N Mahto");
        person.setAge(24);

        // displaying updated details 

        person.displayPersonInfo(); 

    }
}

class Person{

    // Private fields: These fields are not accessible directly from outside

    private String name ; 
    private int age ; 

    // constructor: initializes the fields when an object of the class is created 

    public Person(String name, int age){
        this.name = name ; 
        this.age = age ; 
    }

    // public getter and setter for the 'name' field 

    public String getName(){
        return name ; 
    }

    public void setName(String name){
        this.name = name ; 
    }

    // public getter and setter for the 'age' field

    public void setAge(int age){
        if(age > 0){ // validate the age before setting it
            this.age = age ; 
        }
    }

    // method to display the person's details 

    public void displayPersonInfo(){
        System.out.println("Name: " + name + ", Age: " + age );
    }

    public int getAge(){
        return age ; 
    }

}

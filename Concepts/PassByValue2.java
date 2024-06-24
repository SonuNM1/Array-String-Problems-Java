package Concepts;

public class PassByValue2 {
    public static void main(String[] args) {
        
        Person person = new Person("Alice") ; 
        
        modifyObject(person);
        
        System.out.println("After modify object: " + person.getName());
    }
    
    public static void modifyObject(Person p){
        p.setName("Bob");
    }
}

class Person{
    private String name ; 

    public Person(String name){
        this.name = name ; 
    }
    public String getName(){
        return name ; 
    }
    public void setName(String name){
        this.name = name ; 
    }
}

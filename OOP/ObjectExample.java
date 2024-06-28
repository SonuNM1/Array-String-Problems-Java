package OOP;

public class ObjectExample {
    public static void main(String[] args) {
     
        // creating an object of Car class 

        Car car1 = new Car() ; 
        car1.color = "Red" ; 
        car1.model = "Honda" ; 
        car1.year = 1970 ; 

        car1.displayDetails();

    }
}

class Car{
     String color ;
     String model ;
     int year ; 

     void displayDetails(){
        System.out.println(color);
        System.out.println(model);
        System.out.println(year);
     }
}

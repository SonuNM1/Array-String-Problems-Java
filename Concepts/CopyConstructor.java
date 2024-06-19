package Concepts;

public class CopyConstructor {
    public static void main(String[] args) {
       
        // Creating an original Car object 

        Car originalCar = new Car("Tesla", "Model S", 2023, "Red") ; 

        // Creating a copy of the original Car object using the copy constructor 

        Car copiedCar = new Car(originalCar) ; 

        // displaying details of the original and copied car object 

        System.out.println("Original car: ");
        originalCar.displayDetails();

        System.out.println("Copied car: ");
        copiedCar.displayDetails();

    }
}

class Car{
    private String make; 
    private String model;
    private int year;
    private String color ;

    // Default constructor

    public Car(){
        this("Unknown", "Unknown", 0, "Unknown");
    }

    // Constructor with all parameters 

    public Car(String make, String model, int year, String color){
        this.make = make ;
        this.model = model ;
        this.year = year ;
        this.color = color ; 
    }

    // Copy constructor

    public Car(Car otheCar){
        this.make = otheCar.make;
        this.model = otheCar.model ; 
        this.year = otheCar.year;
        this.color = otheCar.color ; 
    }

    // method to displa the details of the car 

    public void displayDetails(){

        System.out.println("Make: "+make+", Model: "+model+", Year: "+year+", Color: "+color);

    }

}
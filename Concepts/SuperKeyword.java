package Concepts; 

public class SuperKeyword{
    public static void main(String[] args) {
        
        Car car = new Car("Toyota", "Corolla") ; 
        car.displayBrand();
        car.displayModel();

    }
}

class Vehicle{
    private String brand; 

    // Constructor of Vehicle class

    public Vehicle(String brand){
        this.brand = brand ;
        System.out.println("Vehicle constructor called");
    }

    // Method to display the brand 

    public void displayBrand(){
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle{
    private String model ; 

    public Car(String brand, String model){
        super(brand) ; // Calling the constructor of the parent class Vehicle
        this.model = model ; 
        System.out.println("Car constructor called");
    }

    // Method to display the model

    public void displayModel(){
        System.out.println("Model: " + model);
    }

    // Overriding the displayBrand method to include model 

    @Override

    public void displayBrand(){
        super.displayBrand(); // Call the parent class's displayBrand method
        System.out.println("This is a Car of model: " + model);
    }
}
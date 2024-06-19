package Concepts;

public class ConstructorOverloading2 {
    public static void main(String[] args) {
        // Creating objects using different Constructors 

        Car car1 = new Car();
        Car car2 = new Car("Toyota");
        Car car3 = new Car("Honda", "Civic");
        Car car4 = new Car("Ford", "Mustang", 2022);
        Car car5 = new Car("Tesla", "Model S", 2023, "Red");

        // Displaying details of each car
        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
        car4.displayDetails();
        car5.displayDetails();
    }
}

class Car {
    private String make;
    private String model;
    private int year;
    private String color;

    // Default constructor
    public Car() {
        this("Unknown", "Unknown", 0, "Unknown");
    }

    // Constructor with one parameter
    public Car(String make) {
        this(make, "Unknown", 0, "Unknown");
    }

    // Constructor with two parameters (make and model)
    public Car(String make, String model) {
        this(make, model, 0, "Unknown");
    }

    // Constructor with three parameters (make, model, and year)
    public Car(String make, String model, int year) {
        this(make, model, year, "Unknown");
    }

    // Constructor with all parameters
    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Method to display the details of the car
    public void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}

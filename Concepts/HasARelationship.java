package Concepts;

public class HasARelationship {
    public static void main(String[] args) {
        
        Car car = new Car() ; 
        car.startCar(); // Engine starts. Car starts

    }
}

// class representing engine 

class Engine{
    void start(){
        System.out.println("Engine starts");
    }
}

// class representing car 

class Car{
    private Engine engine ; // Car HAS-A Engine 
    
    Car(){
        engine = new Engine() ; 
    }

    void startCar(){
        engine.start(); // uses's the Engine's start method
        System.out.println("Car starts");
    }
}
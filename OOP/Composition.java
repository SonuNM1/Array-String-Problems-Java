
public class Composition {
    public static void main(String[] args) {
        
        Engine v8Engine = new Engine("V8") ; 
        
        Car car = new Car(v8Engine) ; // composing a car with an engine 

        car.start();

    }    
}

// Engine class representing a componenet of a car 

class Engine {
    private String type ; 

    public Engine(String type){
        this.type = type ; 
    }

    public String getType(){
        return type; 
    }
}

// car class using composition to include an engine 

class Car{
    private Engine engine ; // Car 'has-a' Engine

    public Car(Engine engine){
        this.engine = engine ; 
    }

    public void start(){
        System.out.println("Starting car with " + engine.getType() + " engine.");
    }
}



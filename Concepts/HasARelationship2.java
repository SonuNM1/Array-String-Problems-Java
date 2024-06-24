
package Concepts; 

class Processor{
    private String model ; 

    public Processor(String model){
        this.model = model ; 
    }

    public String getModel(){
        return model ; 
    }
}

class RAM{
    
    private int size ; 

    public RAM(int size){
        this.size = size ; 
    }

    public int getSize(){
        return size ; 
    }

}

class Computer{
    private Processor processor; 
    private RAM ram ; 

    public Computer(Processor processor, RAM ram){
        this.processor = processor ; 
        this.ram = ram ; 
    }

    public void displaySpecs(){
        System.out.println("Processor: " + processor.getModel());

        System.out.println("RAM: " + ram.getSize() + "GB");
    }
}

public class HasARelationship2{
    public static void main(String[] args) {
        
        Processor processor = new Processor("Intel i7") ; 
        RAM ram = new RAM(18) ; 
        Computer computer = new Computer(processor, ram) ; 
        computer.displaySpecs(); 

    }
}
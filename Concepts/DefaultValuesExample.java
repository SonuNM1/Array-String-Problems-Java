package Concepts;

public class DefaultValuesExample {

    // Instance Variables 

    byte byteVar ;
    short shortVar ; 
    int intVar ; 
    long longVar ; 
    float floatVar ; 
    double doubleVar ; 
    char charVar ; 
    boolean booleanVar ; 
    String stringVar ; 

    public void printDefaultValues(){

        System.out.println("byte: " + byteVar);
        System.out.println("shot: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: [ " + charVar + "]");
        System.out.println("boolean: " + booleanVar);
        System.out.println("String: " + stringVar);
    }

    public static void main(String[] args) {
        
        DefaultValuesExample obj = new DefaultValuesExample() ; 

        obj.printDefaultValues();

    }

}

package Concepts ; 

public class ShallowCopy{
    public static void main(String[] args) {
        
        Rectangle obj1 = new Rectangle() ; 

        Rectangle obj2 = obj1 ; // Shallow copy

        System.out.println("Before changing the value of object 1, the object 2 will be - ") ; 

        System.out.println("Object 2 length = " + obj2.length + ", Object 2 Breadth = " + obj2.breadth);

        // changing the values for object 1

        obj1.length = 10 ; 
        obj1.breadth = 20 ; 

        System.out.println("\n After changing the value of object 1, the object 2 will be - ");

        System.out.println("Object 2 length = " + obj2.length + ", Object 2 Breadth = " + obj2.breadth);

    }
}

class Rectangle{
    int length = 5;
    int breadth = 3; 
}
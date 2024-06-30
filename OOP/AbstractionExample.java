
public class AbstractionExample{
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(5, 4) ; 

        Circle circle = new Circle(2) ; 

        System.out.println("Rectangle area: " + rectangle.calculateArea());

        System.out.println("Circle area: " + circle.calculateArea());

    }
}

abstract class Shape{
    public abstract double calculateArea() ; 
}

class Rectangle extends Shape{
    private double length ; 
    private double width ; 

    public Rectangle(double width , double length){
        this.length = length ; 
        this.width = width ; 
    }

    public double calculateArea(){
        return (width * length) ; 
    }
}

class Circle extends Shape{
    private double radius ; 

    public Circle(double radius){
        this.radius = radius ; 
    }

    public double calculateArea(){
        return (Math.PI * radius * radius) ; 
    }
}
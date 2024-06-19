package Concepts;

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Rectangle rect1 = new Rectangle();        // Default constructor
        Rectangle rect2 = new Rectangle(5);       // Constructor with one parameter
        Rectangle rect3 = new Rectangle(4, 6);    // Constructor with two parameters

        // Displaying the dimensions of each rectangle
        rect1.displayDimensions(); // Output: Width: 0, Height: 0
        rect2.displayDimensions(); // Output: Width: 5, Height: 5
        rect3.displayDimensions(); // Output: Width: 4, Height: 6
    }
}

class Rectangle {
    private int width;
    private int height;

    // Default constructor
    public Rectangle() {
        this(0, 0); // Calls the constructor with two parameters
    }

    // Constructor with one parameter (square)
    public Rectangle(int side) {
        this(side, side); // Calls the constructor with two parameters
    }

    // Constructor with two parameters (rectangle)
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Method to display the dimensions of the rectangle
    public void displayDimensions() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}

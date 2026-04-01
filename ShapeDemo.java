package polymorphism;

class Shapes {
    double area;

    // Constructor Overloading: No-argument constructor
    public Shapes() {
        this.area = 0;
    }

    // Constructor Overloading: One-argument constructor (for Square)
    public Shapes(double side) {
        this.area = side * side;
    }

    // Method Overloading: Area of a Circle (1 parameter)
    void calculateArea(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }

    // Method Overloading: Area of a Rectangle (2 parameters)
    void calculateArea(double length, double width) {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        // Using the overloaded constructor
        Shapes square = new Shapes(5.0);
        System.out.println("Area of Square (from constructor): " + square.area);

        // Using overloaded methods
        Shapes helper = new Shapes();
        helper.calculateArea(4.0);       // Calls Circle version
        helper.calculateArea(5.0, 6.0);  // Calls Rectangle version
    }
}
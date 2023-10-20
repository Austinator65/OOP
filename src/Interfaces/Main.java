package Interfaces;

//Define the Shape interface
interface Shape {
    double getArea();
}

// Implement the Circle class that adheres to the Shape interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Create a ShapeFactory for creating instances of Shape
class ShapeFactory {
    public static Shape createCircle(double radius) {
        return new Circle(radius);
    }
}

public class Main {
    public static void main(String[] args) {
        // Using the factory to create instances
        Shape circle1 = ShapeFactory.createCircle(5.0);
        Shape circle2 = ShapeFactory.createCircle(3.0);

        // Using dependency injection to create instances
        Shape circle3 = new Circle(7.0);
        Shape circle4 = new Circle(2.0);

        // Calculate and print the areas of the circles
        System.out.println("Area of Circle 1: " + circle1.getArea());
        System.out.println("Area of Circle 2: " + circle2.getArea());
        System.out.println("Area of Circle 3: " + circle3.getArea());
        System.out.println("Area of Circle 4: " + circle4.getArea());
    }
}
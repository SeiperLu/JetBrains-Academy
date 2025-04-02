import java.util.Scanner;

// Define the abstract Shape class with an abstract area() method

abstract class Shape{

    abstract void area();
}

// Implement the Rectangle class that extends Shape

class Rectangle extends Shape{

    private final double length;
    private final double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        System.out.println(this.length * this.width);
    }
}

// Implement the Circle class that extends Shape

class Circle extends Shape{

    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println(Math.PI * this.radius * this.radius);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the rectangle
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        // Read the radius of the circle
        double radius = scanner.nextDouble();

        // Create instances of Rectangle and Circle

        Rectangle rectangle = new Rectangle(length,width);
        rectangle.area();
        Circle circle = new Circle(radius);
        circle.area();

        // Calculate and print the area of the rectangle

        // Calculate and print the area of the circle

        scanner.close();
    }
}
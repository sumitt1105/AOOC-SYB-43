import java.util.Scanner;

// Shape interface
interface Shape {
    void area();
}

// Rectangle class
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Triangle class
class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void area() {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle: " + result);
    }
}


public class AreaDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Rectangle
        System.out.println("Enter details for Rectangle:");
        System.out.print("Length: ");
        double length = scanner.nextDouble();
        System.out.print("Width: ");
        double width = scanner.nextDouble();
        Shape rectangle = new Rectangle(length, width);

        // Input for Triangle
        System.out.println("\nEnter details for Triangle:");
        System.out.print("Base: ");
        double base = scanner.nextDouble();
        System.out.print("Height: ");
        double height = scanner.nextDouble();
        Shape triangle = new Triangle(base, height);

        // Display both areas
        System.out.println("\n--- Calculated Areas ---");
        rectangle.area();
        triangle.area();

        scanner.close();
    }
}

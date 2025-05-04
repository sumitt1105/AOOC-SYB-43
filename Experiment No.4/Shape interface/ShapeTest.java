import java.util.Scanner;

interface Shape {
    void area();
}

class Rectangle implements Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area() {
        double result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void area() {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle: " + result);
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n--- Shape Area Calculator ---");
            System.out.println("1. Calculate area of Rectangle");
            System.out.println("2. Calculate area of Triangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter length of rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter breadth of rectangle: ");
                    double breadth = scanner.nextDouble();
                    Shape rectangle = new Rectangle(length, breadth);
                    rectangle.area();
                    break;

                case 2:
                    System.out.print("Enter base of triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height of triangle: ");
                    double height = scanner.nextDouble();
                    Shape triangle = new Triangle(base, height);
                    triangle.area();
                    break;

                case 3:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        } while (choice != 3);

        scanner.close();
    }
}

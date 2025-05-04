import java.util.Scanner;


abstract class Shape {
    protected double dim1;
    protected double dim2;

  
    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public abstract double area();
}


class Rectangle extends Shape {


    public Rectangle(double length, double width) {
        super(length, width); 
    }


    @Override
    public double area() {
        return dim1 * dim2; 
    }
}

class Triangle extends Shape {

    
    public Triangle(double base, double height) {
        super(base, height); 
    }


    @Override
    public double area() {
        return 0.5 * dim1 * dim2;
    }
}

class Circle extends Shape {

    
    public Circle(double radius) {
        super(radius, 0); 
    }

        @Override
    public double area() {
        return Math.PI * dim1 * dim1; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter length of Rectangle: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        Shape rectangle = new Rectangle(rectangleLength, rectangleWidth);

        
        System.out.print("Enter base of Triangle: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Enter height of Triangle: ");
        double triangleHeight = scanner.nextDouble();
        Shape triangle = new Triangle(triangleBase, triangleHeight);

        
        System.out.print("Enter radius of Circle: ");
        double circleRadius = scanner.nextDouble();
        Shape circle = new Circle(circleRadius);

        
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Circle: " + circle.area());

        
        scanner.close();
    }
}

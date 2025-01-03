import java.util.Scanner;


class Shape {
    public double getPerimeter() {
        return 0.0;
    }

    public double getArea() {
        return 0.0;
    }
}


class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius:");
        double radius = input.nextDouble();

        Shape c = new Circle(radius);

        System.out.println("Perimeter of the circle: " + c.getPerimeter());
        System.out.println("Area of the circle: " + c.getArea());

        input.close();
    }
}

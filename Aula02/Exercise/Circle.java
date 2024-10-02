package Exercise;

public class Circle {
    public double radius = 1;
    public String color = "red";

    public Circle() {
    }

    public Circle(double r) {
        this.radius = r;
    }

    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public void print() {
        System.out.println("\nColor: " + this.color);
        System.out.println("Radius: " + this.radius);
        System.out.println("Area: " + this.getArea() + "\n");
    }
}

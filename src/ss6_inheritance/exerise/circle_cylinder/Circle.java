package ss6_inheritance.exerise.circle_cylinder;

public class Circle {
    private double radius = 1;
    private String color = "Blue";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public String toString() {
        return "Radius: " + getRadius() + "\t Color: " + getColor() + "\t Area: " + getArea();
    }
}

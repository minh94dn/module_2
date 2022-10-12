package ss6_inheritance.exerise.circle_cylinder;

public class Cylinder extends Circle {
    private double height = 1;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }

    public double getArea() {
        return 2 * getRadius() * Math.PI * getHeight();
    }

    @Override
    public String toString() {
        return super.toString() + "\t Height: " + getHeight() + "\t Volume: " + getVolume();
    }
}

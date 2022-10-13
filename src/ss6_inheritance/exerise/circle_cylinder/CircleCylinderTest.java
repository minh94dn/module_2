package ss6_inheritance.exerise.circle_cylinder;

public class TestCircleCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(2);
        System.out.println(cylinder.toString());
    }
}

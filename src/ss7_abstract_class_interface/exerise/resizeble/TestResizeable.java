package ss7_abstract_class_interface.exerise.resizeble;

public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1, "blue", true);
        shapes[1] = new Rectangle(2, 3, "red", true);
        shapes[2] = new Square(2, "yellow", false);
        double percent = Math.floor(Math.random() * 100) + 1;
        System.out.println("Preresize: ");
        for (Shape shape : shapes) {
            System.out.println("\t" + "Area: " + shape.getArea());
        }
        System.out.println("After-resize: " + percent);
        for (Shape shape : shapes) {
            shape.resize(percent);
            System.out.println("\t" + "Area: " + shape.getArea());
        }
    }
}

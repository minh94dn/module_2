package ss7_abstract_class_interface.exerise.colorable;

public class TestColorable {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes[0] = new Square(1,"blue",true);
        shapes[1] = new Circle(2,"red",false);
        shapes[2] = new Rectangle(2, 3, "red",false);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            if (shape instanceof Square){
               ((Square) shape).howToColor();
            }
        }
    }
}

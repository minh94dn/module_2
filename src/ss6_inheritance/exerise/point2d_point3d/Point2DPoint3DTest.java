package ss6_inheritance.exerise.point2d_point3d;

public class TestPoint2DPoint3D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setX(1);
        point2D.setY(2);
        System.out.println(point2D.toString());
        Point3D point3D = new Point3D();
     //   point3D.setXYZ(3,4,5);
        point3D.setX(3);
        point3D.setY(4);
        point3D.setZ(5);
        System.out.println(point3D);
    }
}

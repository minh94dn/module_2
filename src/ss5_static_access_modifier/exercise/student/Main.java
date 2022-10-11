package ss5_static_access_modifier.exercise.student;

public class Main {
    public static void main(String[] args) {
        Student student =new Student();
        System.out.println("Thông tin học sinh thứ nhất là:\n" + student.display());
        Student student1 = new Student();
        student.setName("Minh");
        student.setClasses("C0822G1");
        System.out.println("Thông tin học sinh thứ hai là:\n" + student.display());
    }
}

package ss4_class_oop.exercise.fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.getFAST());
        fan1.setStatus();
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println("Fan1: " + fan1.toString());
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.getMEDIUM());
        System.out.println("Fan2: " + fan2.toString());
    }
}

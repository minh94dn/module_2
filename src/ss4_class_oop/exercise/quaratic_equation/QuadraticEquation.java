package ss4_class_oop.exercise.quaratic_equation;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return getB() * getB() - 4 * getA() * getC();
    }

    public double getRoot1() {
        return (-getB() + Math.sqrt(getB() * getB() - 4 * getA() * getC())) / 2 * getA();
    }

    public double getRoot2() {
        return (-getB() - Math.sqrt(getB() * getB() - 4 * getA() * getC())) / 2 * getA();
    }

    public String condition() {
        if (getA() == 0) {
            if (getB() == 0) {
                if (getC() == 0) {
                    return "Phương trình vô số nghiệm với mọi x.";
                } else {
                    return "Phương trình vô nghiệm.";
                }
            } else {
                return "Nghiệm của phương trình là: " + (-getC() / getB());
            }
        } else if (getDiscriminant() > 0) {
            return "Phương trình có 2 nghiệm phân biệt:\n" + "x1 = " + getRoot1() + "\nx2 = " + getRoot2();
        } else if (getDiscriminant() == 0) {
            return "Phương trình có nghiệm kép:\n" + "x1 = x2 = " + getRoot1();
        } else {
            return "Phương trình vô nghiệm.";
        }
    }
}
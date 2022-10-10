package ss4_class_oop.exercise.quaratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập b: ");
        double b = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập c: ");
        double c = Integer.parseInt(scanner.nextLine());
    QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.condition());
    }
}

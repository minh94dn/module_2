package ss1.exer;


import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Hello: " + name);
    }
}


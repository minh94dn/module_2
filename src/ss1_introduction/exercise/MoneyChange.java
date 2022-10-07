package ss1_introduction.exercise;

import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) {
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD cần đổi: ");
        usd = scanner.nextDouble();
        double results = usd * 23000;
        System.out.println(usd + " USD = " + results + " VND");
    }
}

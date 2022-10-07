package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TotalElementColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        do {
            System.out.print("Nhập số hàng trong mảng: ");
            m = Integer.parseInt(scanner.nextLine());
            if (m <= 0) {
                System.out.println("Hãy nhập số hàng lớn hơn 0");
            }
        } while (m <= 0);
        int n;
        do {
            System.out.print("Nhập số cột trong mảng: ");
            n = Integer.parseInt(scanner.nextLine());
            if (n <= 0) {
                System.out.println("Hãy nhập số hàng lớn hơn 0");
            }
        } while (n <= 0);
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập vào phần tử trong mảng: ");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int[] element : array) {
            System.out.println(Arrays.toString(element));
        }
        int column;
        do {
            System.out.print("Nhập số cột cần tính tổng: ");
            column = Integer.parseInt(scanner.nextLine());
            if (column > n - 1 || column < 0) {
                System.out.println("Hãy nhập số cột nhỏ hơn " + (n - 1) + " và lớn hơn 0");
            } else {
                int sum = 0;
                for (int i = 0; i < m; i++) {
                    sum += array[i][column];
                }
                System.out.print("Tổng các phần tử của cột thứ " + column + " là: " + sum);
            }
        } while (column > n - 1 || column < 0);
    }
}

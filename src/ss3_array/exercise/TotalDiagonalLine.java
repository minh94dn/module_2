package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TotalDiagonalLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số cột và hàng trong ma trận vuông: ");
            n = Integer.parseInt(scanner.nextLine());
            if (n <= 0) {
                System.out.println("Hãy nhập số lớn hơn 0");
            }
        } while (n <= 0);
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập vào phần tử trong mảng: ");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int[] element : array) {
            System.out.println(Arrays.toString(element));
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    sum += array[i][j];
                }
            }
        }
        System.out.print("Tổng các phần tử trong đường chéo là: " + sum);
    }
}

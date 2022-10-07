package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 3, 4, 5, 3, 6, 7, 8, 9};
        int checkElement;
        System.out.print("Nhâp phần tử cần kiểm tra: ");
        checkElement = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (checkElement == array[i]) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                i--;
                array[array.length - 1] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

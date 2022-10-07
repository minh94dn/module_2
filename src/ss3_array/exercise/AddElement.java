package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        int addElement;
        System.out.print("Nhập phần tử cần chèn: ");
        addElement = scanner.nextInt();
        int index;
        System.out.print("Nhập vị trí cần thêm: ");
        index = scanner.nextInt();
        if (index < 0 || index > 5) {
            System.out.print("Không chèn được phần tử này vào mảng");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (index == array[i]) {
                    for (int j = array.length - 1; j > i; j--) {
                        array[j] = array[j - 1];
                    }
                    array[index] = addElement;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
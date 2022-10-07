package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[4];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng thứ nhất: ");
            array1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng thứ nhất là: " + Arrays.toString(array1));
        int[] array2 = new int[6];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng thứ hai: ");
            array2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng thứ hai là: " + Arrays.toString(array2));
        int[] newArray = new int[10];
        for (int i = 0; i < newArray.length; i++) {
            if (i < array1.length) {
                newArray[i] = array1[i];
            } else {
                newArray[i] = array2[i - array1.length];
            }
        }
        System.out.println("Mảng sau khi gộp là: " + Arrays.toString(newArray));
    }
}

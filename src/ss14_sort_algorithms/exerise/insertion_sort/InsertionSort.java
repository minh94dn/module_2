package ss14_sort_algorithms.exerise.insertion_sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử có trong mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa mới tạo là: " + Arrays.toString(array));
        System.out.println("Các bước thay đổi là:");
        InsertionByStep(array);
    }

    private static void InsertionByStep(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
            System.out.println("Bước " + i + " : " + Arrays.toString(arr));
        }
        System.out.print("Mảng sau khi sắp xếp là: " + Arrays.toString(arr));
    }
}
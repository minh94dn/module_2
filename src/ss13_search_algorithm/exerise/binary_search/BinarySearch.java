package ss13_search_algorithm.exerise.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử có: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng vừa mới tạo là: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Mảng sau khi được sắp xếp: " + Arrays.toString(array));
        System.out.print("Nhập số cần kiểm tra: ");
        System.out.println(binarySearch(array, Integer.parseInt(scanner.nextLine()), 0, array.length - 1));
    }

    public static boolean binarySearch(int[] array, int k, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (array[mid] == k) {
                return true;
            }
            if (k > array[mid]) {
                return binarySearch(array, k, mid + 1, right);
            }
            return binarySearch(array, k, left, mid - 1);
        }
        return false;
    }
}

package ss11_dsa_stack_queue.exerise.reserve.reserve_array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReserveArray {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử có trong mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            array[i] = Integer.parseInt(scanner.nextLine());
            stack.push(array[i]);
        }
        System.out.println("Mảng ban đầu là: " + Arrays.toString(array));
        System.out.println("stack: " + stack);
        for (int i = 0; i < size; i++) {
            array[i] = stack.pop();
        }

        System.out.println("Mảng sau khi đảo ngược là: " + Arrays.toString(array));
    }
}

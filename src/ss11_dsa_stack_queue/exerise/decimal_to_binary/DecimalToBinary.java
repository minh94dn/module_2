package ss11_dsa_stack_queue.exerise.decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển đổi: ");
        int number = Integer.parseInt(scanner.nextLine());

        while (number > 0) {
            integerStack.push(number % 2);
            number /= 2;
        }

        System.out.println("Kết quả chuyển đổi: ");
        while (!integerStack.isEmpty()) {
            System.out.print(integerStack.pop());
        }
    }
}

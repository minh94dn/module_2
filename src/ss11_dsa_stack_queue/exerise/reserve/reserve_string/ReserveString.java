package ss11_dsa_stack_queue.exerise.reserve.reserve_string;

import java.util.Scanner;
import java.util.Stack;

public class ReserveString {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập từ có trong chuỗi: ");
        String mWord = scanner.nextLine();
        String[] stringArray = mWord.split("");
        for (String item : stringArray) {
            wStack.push(item);
        }
        mWord = "";
        while (!wStack.isEmpty()) {
            mWord += wStack.pop() + "";
        }
        System.out.println("Chuỗi sau khi đảo ngược là: " + mWord);
    }
}

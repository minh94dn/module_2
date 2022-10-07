package ss3_array.exercise;

import java.util.Scanner;

public class CountSameCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ký tự trong chuỗi: ");
        String str = scanner.nextLine();
        System.out.print("Nhập ký tự cần kiểm tra: ");
        char character = scanner.nextLine().charAt(0);
        int count = 0;
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
                index = i;
                System.out.println("Vị trị xuất hiện " + character + " trong chuỗi là: " + i);
            }
        }
        System.out.print("Số ký tự " + character + " xuất hiện ở trong chuỗi là: " + count);
    }
}

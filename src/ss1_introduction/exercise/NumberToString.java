package ss1_introduction.exercise;

import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển: ");
        int number = scanner.nextInt();
        String[] array = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] array2 = new String[]{"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        int hundred = number / 100;
        int dozens = (number % 100) / 10;
        int unit = (number % 100) % 10;
        if (number >= 100) {
            for (int i = 1; i <= array.length; i++) {
                if (hundred == i) {
                    if (dozens == 0 && unit == 0) {
                        System.out.println(array[i - 1] + " hundred ");
                    } else {
                        System.out.print(array[i - 1] + " hundred and ");
                    }
                }
            }
        }
        if (dozens >= 6) {
            for (int i = 1; i <= array.length; i++) {
                if (dozens == i) {
                    if (unit == 0) {
                        System.out.print(array[i - 1] + "ty");
                    } else {
                        System.out.println(array[i - 1] + "ty " + array[unit - 1]);
                    }
                }
            }
        } else if (dozens < 6 && dozens != 1 && dozens != 0) {
            if (unit == 0) {
                switch (dozens) {
                    case 5:
                        System.out.print("fifty");
                        break;
                    case 4:
                        System.out.print("forty");
                        break;
                    case 3:
                        System.out.print("thirty");
                        break;
                    case 2:
                        System.out.print("twenty");
                        break;
                }
            } else {
                switch (dozens) {
                    case 5:
                        System.out.print("fifty " + array[unit - 1]);
                        break;
                    case 4:
                        System.out.print("forty " + array[unit - 1]);
                        break;
                    case 3:
                        System.out.print("thirty " + array[unit - 1]);
                        break;
                    case 2:
                        System.out.print("twenty " + array[unit - 1]);
                        break;
                }
            }
        } else if (dozens == 1) {
            for (int i = 0; i < array2.length; i++) {
                if (unit == i) {
                    System.out.print(array2[i]);
                }
            }
        } else {
            for (int i = 1; i <= array.length; i++) {
                if (unit == i) {
                    System.out.print(array[i - 1]);
                }
            }
        }
    }
}
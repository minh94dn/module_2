package ss11_dsa_stack_queue.exerise.count_string;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        TreeMap<String, Integer> treemap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi ký tự: ");
        String string = scanner.nextLine();
        String[] array = string.toLowerCase().split(" ");
        for (String key : array) {
            if (!treemap.containsKey(key)) {
                treemap.put(key, 1);
            } else {
                int count = treemap.get(key);
                treemap.put(key, count + 1);
            }
        }
        System.out.println(treemap);

        Set<String> stringSet = treemap.keySet();
        System.out.println("Số lần xuất hiện của mỗi từ có trong chuỗi là: ");
        for (String key : stringSet) {
            System.out.println(key + ": " + treemap.get(key));
        }
    }
}

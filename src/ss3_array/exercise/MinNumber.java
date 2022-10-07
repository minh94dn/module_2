package ss3_array.exercise;

public class MinNumber {
    public static void main(String[] args) {
        int[][] array = {{3, 2, 1}, {6, 7, 2}, {3, 5}};
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}

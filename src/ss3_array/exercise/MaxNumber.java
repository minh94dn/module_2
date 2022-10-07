package ss3_array.exercise;

public class MaxNumber {
    public static void main(String[] args) {
        int[][] array = {{3, 2, 1}, {6, 7, 2}, {3, 5}};
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }
}

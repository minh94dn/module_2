package ss14_sort_algorithms.exerise.set_insertion_sort;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int element;
            element = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > element; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = element;
        }
        return array;
    }
}

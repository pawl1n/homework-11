package array_utils;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 9, 8, 4, 5, 7, 10, 3, 1, 11, 16, 12 };
        int[] arr2 = { 2, 1, 4, 6, 3, 5 };

        SortUtils.bubbleSort(arr);
        SortUtils.bubbleSort(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println(SearchUtils.binarySearch(arr, 9));
    }
}
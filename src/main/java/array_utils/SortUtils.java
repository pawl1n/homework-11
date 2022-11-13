package array_utils;

public class SortUtils {

    private SortUtils() {}

    private static void swap(int[] arr, int i, int j) {
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }

    public static void bubbleSort(int[] arr) {
        int length = arr.length - 1;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }
}

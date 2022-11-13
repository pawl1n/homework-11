package array_utils;

public class SearchUtils {

    private SearchUtils() {}

    public static int binarySearch(int[] arr, int val) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int center = (low + high) / 2;

            if (val < arr[center]) {
                high = center - 1;
            } else if (val > arr[center]) {
                low = center + 1;
            } else {
                return center;
            }
        }

        return -1;
    }
}

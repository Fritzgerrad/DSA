package Algorithms;

public class Search {
    public static int LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] arr, int target) {
        int size = arr.length;
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                right = mid - 1;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
        }
        return -1;
    }
}

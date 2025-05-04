package org.example;

public class BinarySearch {
    public static boolean binarySearch(int[] array, int value) {
        if (array == null) {
            throw new NullPointerException("Array must not be null");
        }
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == value) {
                return true;
            } else if (array[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}

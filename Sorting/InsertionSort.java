package Sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        int size = arr.length;

        System.out.println("Original array:");
        for (int nums : arr) {
            System.out.print(nums + " ");
        }

        for (int i = 1; i < size; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        System.out.println("\nSorted array:");
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }
}

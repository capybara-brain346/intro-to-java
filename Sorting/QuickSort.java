package Sorting;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;

    }

    public static void main(String[] args) {
        int[] arr = {5, 61, 234, 3, 82, 4};

        System.out.println("Unsorted Array:");
        for (int nums : arr) {
            System.out.printf("%d ", nums);
        }

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted Array:");
        for (int nums : arr) {
            System.out.printf("%d ", nums);
        }

    }
}

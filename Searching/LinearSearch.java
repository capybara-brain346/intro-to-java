package Searching;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        // Traverse through all elements in the array
        for (int i = 0; i < arr.length; i++) {
            // If the element is found, return the index
            if (arr[i] == target) {
                return i;  // Element found
            }
        }
        // Target is not present in the array
        return -1;
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};  // Sample array
        int target = 10;

        System.out.println("Original array:");
        printArray(arr);

        int result = linearSearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}

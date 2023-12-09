public class Practical6 {
    public static void main(String[] args) { // Main method
        int[] arr = { 5, 3, 7, 2, 8, 4, 1, 6 };
        System.out.println("Original array: " + java.util.Arrays.toString(arr)); // Display the original array

        quickSort(arr, 0, arr.length - 1); // Call the quickSort method

        System.out.println("Sorted array using Quick Sort: " + java.util.Arrays.toString(arr)); // Display the sorted
                                                                                                // array
    }

    public static void quickSort(int[] arr, int low, int high) { // Quick Sort method
        if (low < high) {
            int partitionIndex = partition(arr, low, high); // Partition the array i.e., place the pivot element at its
                                                            // correct position in the sorted array

            System.out.println("Pass: " + java.util.Arrays.toString(arr)); // Display the array after each pass

            quickSort(arr, low, partitionIndex - 1); // Recursively sort the left subarray
            quickSort(arr, partitionIndex + 1, high); // Recursively sort the right subarray
        }
    }

    private static int partition(int[] arr, int low, int high) { // Partition method
        int pivot = arr[high]; // Select the last element as the pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) { // Traverse the array
            if (arr[j] < pivot) { // If current element is smaller than the pivot
                i++; // Increment the index of smaller element
                swap(arr, i, j); // Swap the elements at i and j
            }
        }

        swap(arr, i + 1, high); // Swap the pivot element with the element at i + 1
        return i + 1; // Return the index of the pivot element
    }

    private static void swap(int[] arr, int i, int j) { // Swap method
        int temp = arr[i]; // Swap the elements at i and j
        arr[i] = arr[j]; // Swap the elements at i and j
        arr[j] = temp; // Swap the elements at i and j
    }
}

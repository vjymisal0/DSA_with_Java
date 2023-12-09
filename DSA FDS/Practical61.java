public class Practical61 {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 7, 2, 8, 4, 1, 6 }; // Create an array of integers
        System.out.println("Original array: " + java.util.Arrays.toString(arr)); // Display the original array

        mergeSort(arr, 0, arr.length - 1); // Call the mergeSort method

        System.out.println("Sorted array using Merge Sort: " + java.util.Arrays.toString(arr)); // Display the sorted
         // array
    }

    public static void mergeSort(int[] arr, int left, int right) { // Merge Sort method
        if (left < right) { // If there are more than one elements
            int mid = (left + right) / 2; // Find the middle index

            mergeSort(arr, left, mid); // Recursively sort the left subarray
            mergeSort(arr, mid + 1, right); // Recursively sort the right subarray

            merge(arr, left, mid, right); // Merge the sorted left and right subarrays

            System.out.println("Pass: " + java.util.Arrays.toString(arr)); // Display the array after each pass
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) { // Merge method
        int n1 = mid - left + 1; // Size of the left subarray
        int n2 = right - mid; // Size of the right subarray

        int[] leftArray = new int[n1]; // Create temporary arrays
        int[] rightArray = new int[n2]; // Create temporary arrays

        for (int i = 0; i < n1; i++) { // Copy the elements to the temporary arrays
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) { // Copy the elements to the temporary arrays
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left; // Initial indexes of the left, right and merged subarrays
        while (i < n1 && j < n2) { // Merge the temporary arrays
            if (leftArray[i] <= rightArray[j]) { // If the current element of the left subarray is smaller than or equal
                                                 // to the current element of the right subarray
                arr[k++] = leftArray[i++]; // Copy the current element of the left subarray to the merged subarray
            } else { // If the current element of the left subarray is greater than the current
                     // element of the right subarray
                arr[k++] = rightArray[j++]; // Copy the current element of the right subarray to the merged subarray
            }
        }

        while (i < n1) { // Copy the remaining elements of the left subarray
            arr[k++] = leftArray[i++];
        }
        while (j < n2) { // Copy the remaining elements of the right subarray
            arr[k++] = rightArray[j++];
        }
    }
}

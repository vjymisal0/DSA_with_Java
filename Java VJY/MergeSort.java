public class MergeSort {
    public static void main(String[] args) {
        int[] array = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Original array: ");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("\nSorted array: ");
        printArray(array);
    }

    // Function to merge two sub-arrays of array[]
    private static void merge(int array[], int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temporary arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temporary arrays L[] and R[]
        for (int i = 0; i < n1; ++i)
            L[i] = array[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = array[middle + 1 + j];

        // Merge the temporary arrays back into array[left..right]
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of L[], if there are any
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // Copy the remaining elements of R[], if there are any
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts array[left..right] using merge()
    private static void mergeSort(int array[], int left, int right) {
        if (left < right) {
            // Same as (left+right)/2, but avoids overflow
            int middle = left + (right - left) / 2;

            // Sort first and second halves
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            // Merge the sorted halves
            merge(array, left, middle, right);
        }
    }

    // Function to print an array
    private static void printArray(int array[]) {
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}

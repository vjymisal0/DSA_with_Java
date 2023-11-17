public class MergeSort1 {
    private static void mergeSort(int a[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2; // Find the middle point
            mergeSort(a, l, m); // Sort first and second halves
            mergeSort(a, m + 1, r); // Sort first and second halves
            merge(a, l, m, r); // Merge the sorted halves
        }

    }

    private static void merge(int a[], int l, int m, int r) { // Merges two subarrays of a[].

        int n1 = m - l + 1; // Find sizes of two subarrays to be merged 3-0+1=4
        int n2 = r - m; // Find sizes of two subarrays to be merged 6-3=3

        int L[] = new int[n1]; // Create temp arrays 4
        int R[] = new int[n2]; // Create temp arrays 3

        for (int i = 0; i < n1; i++)
            L[i] = a[l + i]; // Copy data to temp arrays

        for (int j = 0; j < n2; j++)
            R[j] = a[m + 1 + j]; // Copy data to temp arrays

        int i = 0, j = 0; // Initial indexes of first and second subarrays
        int k = l; // Initial index of merged subarray

        while (i < n1 && j < n2) { // Merge the temp arrays
            if (L[i] <= R[j]) // If current element of L[] is smaller than R[]
                a[k++] = L[i++]; // then copy it to a[k] and increment i
            else // Else copy current element of R[] to a[k] and increment j
                a[k++] = R[j++]; // Increment k
        }

        while (i < n1) // Copy remaining elements of L[] if any
            a[k++] = L[i++];
        while (j < n2) // Copy remaining elements of R[] if any
            a[k++] = R[j++];
    }

    public static void main(String[] arg) {
        int a[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Given Array");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        mergeSort(a, 0, a.length - 1);
        System.out.println("\nSorted array");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

    }
}
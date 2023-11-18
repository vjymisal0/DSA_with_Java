
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 8 };
        System.out.println("Unsorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                // swap if arr[j] > arr[j+1]
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            // if no two elements were swapped by inner loop, then break
            if (swapped == false)
                break;
        }
        System.out.println("\nSorted array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }
}

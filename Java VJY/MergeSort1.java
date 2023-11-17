public class MergeSort1 {
    private static void mergeSort(int a[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }

    }

    private static void merge(int a[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = a[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = a[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                a[k++] = L[i++];
            else
                a[k++] = R[j++];
        }
        while (i < n1)
            a[k++] = L[i++];
        while (j < n2)
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
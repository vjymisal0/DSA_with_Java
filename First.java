//program to insert elements in an array, traversal, insertion, creation concepts

import java.util.Scanner;

class First {
    public static void main(String[] argv) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n + 1];
        System.out.println("Enter values: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("Enter index of new value to be inserted: ");
        int m = sc.nextInt();
        System.out.println("Enter value to be inserted");
        int p = sc.nextInt();
        for (int i = 0; i < n + 1; i++) {
            if (i < m) {
                b[i] = a[i];

            } else if (i == m) {
                b[i] = p;
            } else {
                b[i] = a[i];
            }
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + "  ");
        }

    }
}
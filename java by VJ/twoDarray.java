import java.util.*;

class twoDarray {

  public static void main(String args[]) {
    int a[][] = new int[3][3];
    int i, j;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter 3*3 Array Elements: ");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        a[i][j] = s.nextInt();
      }
    }
    System.out.println("Your 3*3 Array Elements: ");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}

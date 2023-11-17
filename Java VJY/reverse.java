import java.util.*;

class reverse {

  public static void main(String args[]) {
    int n;
    Scanner sn = new Scanner(System.in);
    System.out.println("Enter any number: ");
    n = sn.nextInt();
    int rem;
    System.out.println("Reverse order: ");
    while (n > 0) {
      rem = n % 10;
      System.out.print(rem);
      n = n / 10;
    }
  }
}

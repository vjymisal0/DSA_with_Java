//nested-if-else: number is positive or wott?
import java.util.*;

class java16 {

  public static void main(String args[]) {
    int no;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Any Integer number: ");
    no = s.nextInt();
    if (no == 0) {
      System.out.println("Zero is neither positive not negative");
    } else {
      if (no > 0) {
        System.out.println("Number is positive");
      } else {
        System.out.println("Number is Negative");
      }
    }
  }
}

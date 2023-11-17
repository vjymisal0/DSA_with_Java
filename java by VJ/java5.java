//Scanner Class Demo
import java.util.*;

class java5 {

  public static void main(String args[]) {
    int no;
    System.out.println("Enter Any Integer Number: ");
    Scanner s = new Scanner(System.in);
    no = s.nextInt();
    if (no % 2 == 0) {
      System.out.println("Number is Even");
    } else {
      System.out.println("Number is Odd");
    }
  }
}

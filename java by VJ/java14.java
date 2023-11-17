//Instanceof operator in java
import java.util.Scanner;

class java14 {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    if (s instanceof Scanner) {
      System.out.println("s is object of Scanner Class");
    }
  }
}

//Switch case in JAVA
import java.util.*;

class java18 {

  public static void main(String args[]) {
    int no;
    Scanner s = new Scanner(System.in);
    no = s.nextInt();
    switch (no) {
      case 1:
        System.out.println("You have entered One");
        break;
      case 2:
        System.out.println("You have entered two");
        break;
      case 3:
        System.out.println("You have entered three");
        break;
      default:
        System.out.println("invalid Input");
    }
  }
}

//prime numbers program in java
import java.util.*;

//prime numbers are divisible by itself and 1 only
class java25 {

  public static void main(String args[]) {
    int no;
    int flag = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any integer no: ");
    no = s.nextInt();
    for (int i = 2; i < no; i++) {
      if (no % i == 0) {
        flag = 1;
        break;
      }
    }
    if (flag == 0) System.out.println(
      "Number is Prime!!"
    ); else System.out.println("Number is not Prime!!");
  }
}

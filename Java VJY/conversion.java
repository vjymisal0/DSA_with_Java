//write a java program to convert no of days into months & days
import java.util.*;

class conversion {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num, days, month;
    System.out.println("Please Enter No. of Days: ");
    num = s.nextInt();
    month = num / 30;
    days = num % 30;
    System.out.println(
      num + " days: " + month + " months and " + days + " days"
    );
  }
}

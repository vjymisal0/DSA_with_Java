import java.util.*;

class prime_numbers {

  public static void main(String args[]) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number to check whether its prime or not: ");
    num = sc.nextInt();
    boolean flag = false;
    for (int i = 2; i <= num / 2; i++) {
      if (num % 2 == 0) {
        flag = true;
        break;
      }
    }
    if (!flag) {
      System.out.println(num + " is prime number!");
    } else {
      System.out.println(num + " is not a prime number!");
    }
  }
}

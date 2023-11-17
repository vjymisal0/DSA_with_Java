import java.util.Scanner;

class armstrong {

  public static void main(String args[]) {
    int rem, arm = 0;
    Scanner sn = new Scanner(System.in);
    System.out.println("ENTER ANY NUMBER: ");
    int n = sn.nextInt();
    int c = n;
    while (n > 0) {
      rem = n % 10;
      arm = (rem * rem * rem) + arm;
      n = n / 10;
    }
    if (c == arm) System.out.println(
      c + " number is armstrong"
    ); else System.out.println(c + " isn't an armstrong number");
  }
}

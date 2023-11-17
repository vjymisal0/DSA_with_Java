import java.util.*;

class palindrome {

  public static void main(String args[]) {
    int n;
    int rem, temp, s = 0;
    Scanner sn = new Scanner(System.in);
    System.out.println("Enter any number: ");
    n = sn.nextInt();
    temp = n;
    while (n > 0) {
      rem = n % 10;
      s = s * 10 + rem;
      n = n / 10;
    }
    if (temp == s) System.out.println(
      temp + " Number is palindrome!"
    ); else System.out.println(temp + " Number is not a palindrome");
  }
}

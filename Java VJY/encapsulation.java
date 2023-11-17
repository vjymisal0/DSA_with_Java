//encapsulation is the mechanism through which we can bind data members and member methods in a single unit
import java.util.Scanner;

class encapsulation {

  private double bal = 600;
  private int pwd;

  public void deposite(double money) {
    System.out.print("Enter Password: ");
    Scanner sc = new Scanner(System.in);
    pwd = sc.nextInt();
    if (pwd == 123) {
      bal = bal + money;
      System.out.println("Deposited Money: " + money);
      System.out.println("Total Balance: " + bal);
    } else {
      System.out.println("Incorrect Password!");
    }
  }

  public void withdraw(double money) {
    System.out.print("Enter Password: ");
    Scanner sc = new Scanner(System.in);
    pwd = sc.nextInt();
    if (pwd == 123) {
      bal = bal - money;
      System.out.println("Withdrwa Money: " + money);
      System.out.println("Total Balance: " + bal);
    } else {
      System.out.println("Incorrect Password!");
    }
  }

  public void checkbal() {
    System.out.print("Enter Password: ");
    Scanner sc = new Scanner(System.in);
    pwd = sc.nextInt();
    if (pwd == 123) {
      System.out.println("Total Balance: " + bal);
    } else {
      System.out.println("Chor Chor bhagg Bhosdaike: !!!");
    }
  }

  public static void main(String args[]) {
    encapsulation e1 = new encapsulation();
    int ch;
    System.out.println("1. Deposite: ");
    System.out.println("2. Withdraw: ");
    System.out.println("3. CheckBalance: ");
    System.out.println("Choose Anything of the above services: ");
    Scanner sc = new Scanner(System.in);
    ch = sc.nextInt();
    switch (ch) {
      case 1:
        e1.deposite(100);
        break;
      case 2:
        e1.withdraw(200);
        break;
      case 3:
        e1.checkbal();
        break;
      default:
        System.out.println("Invalid Choice");
        break;
    }
  }
}

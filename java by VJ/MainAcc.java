/*
write a java program to accept account no , holder's name and  bank balance using classes and objects
 */
import java.util.*;

class Account {

  int acc_no;
  String acc_name;
  float balance;

  void get_data() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Account Number: ");
    acc_no = s.nextInt();
    System.out.println("Enter Account Holder Name: ");
    acc_name = s.next();
    System.out.println("Enter Account Balance: ");
    balance = s.nextFloat();
  }

  void disp_data() {
    System.out.println(acc_no + "\t" + acc_name + "\t" + balance);
  }
}

class MainAcc {

  public static void main(String args[]) {
    Account a1 = new Account();
    a1.get_data();
    a1.disp_data();
  }
}

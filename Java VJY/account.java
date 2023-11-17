import java.util.*;

class account {

  int acc_no;
  String name;
  double balance;

  void get_acc_details() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Account No: ");
    acc_no = s.nextInt();
    System.out.println("Enter Account Balance: ");
    balance = s.nextDouble();
    System.out.println("Enter Account Holder Name: ");
    name = s.next();
  }

  void disp_acc_details() {
    System.out.println("Account No: " + acc_no);
    System.out.println("Name: " + name);
    System.out.println("Balance: " + balance);
  }

  public static void main(String args[]) {
    account a1[] = new account[5];
    for (int i = 0; i < 5; i++) {
      a1[i] = new account();
      a1[i].get_acc_details();
    }
    for (int i = 0; i < 5; i++) {
      a1[i].disp_acc_details();
    }
    /*a1[0].get_acc_details(1234, "Vijay", 452.789);
    a1[0].disp_acc_details();*/
  }
}

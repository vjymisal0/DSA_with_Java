import java.util.*;

class tender {

  String company_name;
  double cost;

  void get_tender_details() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Company Name: ");
    company_name = s.next();
    System.out.println("Enter Tender Cost: ");
    cost = s.nextDouble();
  }

  void disp_tender_info() {
    System.out.println("Company Name: " + company_name);
    System.out.println("Tender Cost: " + cost);
  }

  public static void main(String args[]) {
    tender t1[] = new tender[3];
    for (int i = 0; i < 3; i++) {
      t1[i] = new tender();
      t1[i].get_tender_details();
    }
    for (int j = 0; j < 3; j++) {
      t1[j].disp_tender_info();
    }
  }
}

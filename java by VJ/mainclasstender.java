/*
Array of Objects: Defina class Tender having data mebers company name and cost. Accept and display data for 5 objexts using array of Objects
*/
import java.util.*;

class Tender {

  String company_name;
  float cost;

  void get_tender_details() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Company Name: ");
    company_name = s.next();
    System.out.println("Enter Tender Cost: ");
    cost = s.nextFloat();
  }

  void disp_tender_details() {
    System.out.println(company_name + "\t" + cost);
  }
}

class mainclasstender {

  public static void main(String args[]) {
    Tender t[] = new Tender[5];
    int i;
    //object installation
    for (i = 0; i < 5; i++) {
      t[i] = new Tender();
    }
    //getting tender details
    for (i = 0; i < 5; i++) {
      t[i].get_tender_details();
    }
    System.out.println("*******Tender Management System******");
    System.out.println("CompanyName\tCost");
    for (i = 0; i < 5; i++) {
      t[i].disp_tender_details();
    }
  }
}

import java.util.*;

interface gross {
  int TA = 5000;
  int DA = 10000;
  void gross_sal();
}

class employee {

  String name;
  int basic_sal;

  void get_details() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Employee Salary: ");
    basic_sal = s.nextInt();
    System.out.println("Enter Employee Name: ");
    name = s.next();
  }
}

class salary extends employee implements gross {

  int HRA = 15;
  int gross_salary;

  public void gross_sal() {
    gross_salary = (basic_sal + DA + HRA + TA);
  }

   void disp_details() {
    System.out.println("Employee Name: " + name);
    System.out.println("Basic Salary: " + basic_sal);
    System.out.println("TA: " + TA);
    System.out.println("DA: " + DA);
    System.out.println("HRA: " + HRA);
    System.out.println("Gross Salary: " + gross_salary);
  }

  public static void main(String args[]) {
    salary s1 = new salary();
    s1.get_details();
    s1.gross_sal();
    s1.disp_details();
  }
}

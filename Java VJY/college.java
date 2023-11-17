import java.util.*;

class college {

  static int college_code = 123;
  String dept_name;
  int students;

  void get_college_details() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Dept Name: ");
    dept_name = s.next();
    System.out.println("Enter No. Of Students: ");
    students = s.nextInt();
  }

  static void disp_code() {
    System.out.print("College Code: " + college_code);
  }

  void disp_details() {
    System.out.println(
      "\tDept Name: " + dept_name + "\tNumber of Students: " + students
    );
  }

  public static void main(String args[]) {
    college c1 = new college();
    college c2 = new college();
    college c3 = new college();
    c1.get_college_details();
    c2.get_college_details();
    c3.get_college_details();
    System.out.println("College Info: ");
    college.disp_code();
    c1.disp_details();
    college.disp_code();
    c2.disp_details();
    college.disp_code();
    c3.disp_details();
  }
}

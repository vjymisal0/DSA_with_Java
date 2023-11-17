import java.util.*;

class Student {

  int rollno;
  String name;
  float marks;

  void get_stud_info() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Student Roll No: ");
    rollno = s.nextInt();
    System.out.println("Enter Student Name: ");
    name = s.next();
    System.out.println("Enter Student Marks: ");
    marks = s.nextFloat();
  }

  void disp_stud_info() {
    System.out.println(rollno + "\t" + name + "\t" + marks);
  }

  public static void main(String arfgsp[]) {
    Student s1 = new Student();
    s1.get_stud_info();
    s1.disp_stud_info();
  }
}

//write a java program to create a class student having data members rollno, name, marks. Accept and display data for one object
import java.util.*;

class Student {

  int rollno;
  String name;
  float marks;
  char grade;

  void get_stud_info() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Student Name: ");
    name = s.next();
    System.out.println("Enter Student Roll No: ");
    rollno = s.nextInt();
    System.out.println("Enter Student Marks: ");
    marks = s.nextFloat();
    System.out.println("Enter Student Grade: ");
    grade = s.next().charAt(0);
  }

  void disp_stud_info() {
    System.out.println("Student Info: ");
    System.out.println("Student Name: " + name);
    System.out.println("Student Roll No: " + rollno);
    System.out.println("Student Grade: " + grade);
    System.out.println("Student Marks: " + marks);
  }

  public static void main(String args[]) {
    Student s1 = new Student();
    s1.get_stud_info();
    s1.disp_stud_info();
  }
}

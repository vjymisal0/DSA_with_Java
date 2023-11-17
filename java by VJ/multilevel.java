import java.util.*;

class student {

  int rollno;
  String name;

  void get_stud_info() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student Roll No: ");
    rollno = sc.nextInt();
    System.out.println("Enter Student Name: ");
    name = sc.next();
  }

  void disp_stud_info() {
    System.out.println("Student Roll No: " + rollno);
    System.out.println("Student Name: " + name);
  }
}

class test extends student {

  int marks1, marks2;

  void get_stud_marks() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student Test-1 Marks: ");
    marks1 = sc.nextInt();
    System.out.println("Enter Student Test-1 Marks: ");
    marks2 = sc.nextInt();
  }

  void disp_stud_marks() {
    System.out.println("Test-1 Marks: " + marks1);
    System.out.println("Test-2 Marks: " + marks2);
  }
}

class result extends test {

  int total_marks;

  void get_total_marks() {
    total_marks = marks1 + marks2;
  }

  void disp_total_marks() {
    System.out.println("Total Marks: " + total_marks);
  }
}

class multilevel {

  public static void main(String args[]) {
    result r1 = new result();
    r1.get_stud_info();
    r1.get_stud_marks();
    r1.get_total_marks();

    r1.disp_stud_info();
    r1.disp_stud_marks();
    r1.disp_total_marks();
  }
}

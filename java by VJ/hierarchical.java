import java.util.*;

class student {

  int rollno;
  String name;
  Scanner sc = new Scanner(System.in);

  void get_info() {
    System.out.println("Enter Student Roll No: ");
    rollno = sc.nextInt();
    System.out.println("Enter Student Name: ");
    name = sc.next();
  }

  void put_info() {
    System.out.println("Student Name: " + name + " Roll No: " + rollno);
  }
}

class test extends student {

  int marks1, marks2;

  void get_stud_marks() {
    System.out.println("Enter Student Test-1 Marks: ");
    marks1 = sc.nextInt();
    System.out.println("Enter Student Test-2 Marks: ");
    marks2 = sc.nextInt();
  }

  void disp_stud_marks() {
    System.out.println(
      "Student Test-1 Marks: " + marks1 + " Test-2 Marks: " + marks2
    );
  }
}

class sports extends student {

  float sport_wt;

  void get_sport_info() {
    sport_wt = 8.9f;
  }

  void put_sport_info() {
    System.out.println("Sport Weightage: " + sport_wt);
  }
}

class hierarchical {

  public static void main(String args[]) {
    test t1 = new test();
    t1.get_info();
    t1.get_stud_marks();
    t1.disp_stud_marks();
    t1.put_info();
    sports s1 = new sports();
    s1.get_info();
    s1.get_sport_info();
    s1.put_info();
    s1.put_sport_info();
  }
}

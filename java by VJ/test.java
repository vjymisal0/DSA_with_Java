import java.util.*;

class student {

  int roll_no;
  String name;

  void get_info() {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter Student Name: ");
    name = s.next();
    System.out.println("Enter Roll Number: ");
    roll_no = s.nextInt();
  }

  void put_info() {
    System.out.println("Student Name: " + name + " Roll No: " + roll_no);
  }
}

class test extends student {

  int marks;

  void get_data() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student Marks: ");
    marks = sc.nextInt();
  }

  void put_data() {
    System.out.println(
      "Name: " + name + " Marks: " + marks + " Roll No: " + roll_no
    );
  }
}
class vip{
    public static void main(String args[])
    {
        test t1=new test();
        t1.get_data();
        t1.get_info();
        t1.put_info();
        t1.put_data();
    }
}

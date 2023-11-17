import java.util.*;

class A {

  int rollno;
  String name;

  void get_data() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Roll No: ");
    rollno = s.nextInt();
    name = s.next();
  }

  void put_data() {
    System.out.println("Roll No: " + rollno + " Name: " + name);
  }
}

class B extends A {

  int classno;

  void get_class() {
    System.out.println("Enter Student Class No: ");
    Scanner sc = new Scanner(System.in);
    classno = sc.nextInt();
  }

  void put_class() {
    System.out.println("Class No: " + classno);
  }
}

class C {

  int sports;

  void get_sport_details() {
    System.out.println("Entert Sports No.: ");
    Scanner sc = new Scanner(System.in);
    sports = sc.nextInt();
  }
}
class D extends C{

}
class hybrid {}

import java.util.*;

class a {

  int a;

  void get_data() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any number: ");
    a = s.nextInt();
  }
}

class b {

  int b = 10;

  void put_data() {
    System.out.println("Value of b: " + b);
  }
}

class c extends a {

  void put_info() {
    System.out.println("Hello");
  }
}

class multiple {

  public static void main(String args[]) {
    c c1 = new c();
    c1.get_data();
    c1.put_data();
    c1.put_info();
  }
}

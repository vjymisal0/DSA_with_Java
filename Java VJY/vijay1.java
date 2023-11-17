class A {

  int a;
  String b;
  boolean c;

  A() {
    a = 100;
    b = "Vijay";
    c = true;
  }

  void disp() {
    System.out.println(a + " " + b + " " + c);
  }
}

class vijay1 {

  public static void main(String args[]) {
    A r = new A();
    r.disp();
  }
}

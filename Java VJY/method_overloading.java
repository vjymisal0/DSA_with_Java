class method_overloading {

  int a, b, c;

  void getdata() {
    a = 100;
    b = 200;
    c = 300;
  }

  void getdata(float x) {
    a = (int) x;
    b = 50;
    c = 100;
  }

  void getdata(int x, int y, int z) {
    a = x;
    b = y;
    c = z;
  }

  void display() {
    System.out.println("a: " + a + "\tb: " + b + "\tc: " + c);
  }

  public static void main(String args[]) {
    method_overloading m1 = new method_overloading();
    method_overloading m2 = new method_overloading();
    method_overloading m3 = new method_overloading();
    m1.getdata();
    m2.getdata(900, 800, 700);
    m3.getdata(450);
    m1.display();
    m2.display();
    m3.display();
  }
}

//class, object and methods
class java29 {

  int a, b, c;

  void get_data() {
    a = 100;
    b = 200;
  }

  void display() {
    c = a + b;
    System.out.println("Addition of  Two Numbers: " + c);
  }

  public static void main(String args[]) {
    java29 j = new java29();
    j.get_data();
    j.display();
  }
}

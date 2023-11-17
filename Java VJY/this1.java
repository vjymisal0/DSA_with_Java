//this keyword in java
//each class in java has unique reference number!!
//this keyword is used to not let JVM get confused while accessing instance variable and local variable
class this1 {

  int a;

  this1(int a) {
    this.a = a;
  }

  void show() {
    System.out.println(a);
  }

  public static void main(String args[]) {
    this1 r = new this1(100);
    System.out.println(r);
    r.show();
  }
}

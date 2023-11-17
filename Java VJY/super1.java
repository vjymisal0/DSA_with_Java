//super keyword can be used 3 times in program
class A {

  // int a=10;
  A(int a) {
    System.out.println(a);
  }
}

class B extends A {

  // int a=20;
  B() {
      super(100);
    System.out.println("Hello Learner");
    // super.show();
    // System.out.println(super.a);
  }
}

public class super1 {

  public static void main(String args[]) {
    B r = new B();
    // r.show();
  }
}

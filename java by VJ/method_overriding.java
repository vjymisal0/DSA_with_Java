class Base {

  void display() {
    System.out.println("display() method of base class");
  }
}

class Derived extends Base {

  void display() {
    //   super.display();
    System.out.println("display() method of derived class");
  }
}

class method_overriding {

  public static void main(String args[]) {
    Derived d1 = new Derived();
    d1.display();
  }
}

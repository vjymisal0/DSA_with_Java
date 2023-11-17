/*
Base class constructor should not be inherited in its sub class
we use super keyword if there's constructor present in base class to be called
Systax: super();
or
super(argument list);
*/
class base {

  base(int m) {
    System.out.println("Base class Constructor Called!! " + m);
  }
}

class Derived extends base {

  Derived(int x, int y) {
    super(x);
    System.out.println("Derived Class Cosntructor called!! " + y);
  }
}

class base_class_constructor {

  public static void main(String args[]) {
    new Derived(12, 21);
   
  }
}

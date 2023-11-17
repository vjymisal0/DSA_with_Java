class newone {

  newone() {
    System.out.print("Learn Coding");
  }

  newone(int a) {
    this();
    System.out.println(a);
  }

  public static void main(String args[]) {
    newone n = new newone(100);
    // newone n1=new newone();
  }
}

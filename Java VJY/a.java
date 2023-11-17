class a {

  int a;
  double b;
  String c;

  private a() {
    a = 10;
    b = 23.23;
    c = "Vijay";
    System.out.println(a + " " + b + " " + c);
  }

  public static void main(String args[]) {
    a r = new a();
  }
}

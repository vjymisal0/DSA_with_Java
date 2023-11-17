//static data member and static data member functions
class Staticdemo {

  int no;
  static int count;

  void get_data(int x) {
    no = x;
    count++;
  }

  void display() {
    System.out.println("Value of no: " + no);
  }

  static void display_count() {
    System.out.println("Value of count: " + count);
  }

  public static void main(String args[]) {
    Staticdemo s1 = new Staticdemo();
    Staticdemo s2 = new Staticdemo();
    Staticdemo s3 = new Staticdemo();
    s1.get_data(100);
    s2.get_data(200);
    s3.get_data(300);
    System.out.println("Object s1: ");
    s1.display();
    Staticdemo.display_count();
    System.out.println("Object s2: ");
    s2.display();
    Staticdemo.display_count();
    System.out.println("Object s3: ");
    s3.display();
    Staticdemo.display_count();
  }
}

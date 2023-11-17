class thisdemo {

  int x, y, z;

  void get_data() {
    this.x = 10;
    this.y = 20;
    this.z = 30;
  }

  void put_data() {
    System.out.println("Value of x: " + this.x);
    System.out.println("Value of y: " + this.y);
    System.out.println("Value of z: " + this.z);
  }

  public static void main(String args[]) {
    thisdemo t1 = new thisdemo();
    t1.get_data();
    t1.put_data();
  }
}

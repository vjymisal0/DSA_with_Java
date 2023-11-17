//default constructor
class rectangle {

  int length, width;

  rectangle() {
    length = 10;
    width = 12;
  }

  void calc_area() {
    System.out.println("Area of Rectangle: " + (length * width));
  }

  public static void main(String args[]) {
    rectangle r1 = new rectangle();
    r1.calc_area();
  }
}

//parameterized constructor -area if perimeter
class perimeter {

  int length, breadth;

  perimeter(int x, int y) {
    length = x;
    breadth = y;
  } 

  void calc_area() {
    int area;
    area = 2 * (length + breadth);
    System.out.println("Area of Perimeter is : " + area);
  }

  public static void main(String args[]) {
    perimeter p1 = new perimeter(10, 20);
    p1.calc_area();
  }
}

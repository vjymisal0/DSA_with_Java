//first interface :'vijay
interface area {
  float PI = 3.14f;
  void compute(int x, int y);
}

class b implements area {

  float area;

  public void compute(int x, int y) {
    int a = x;
    int b = y;
    area = PI * (a * b);
    System.out.print(area);
  }
}

class vijay12 {

  public static void main(String args[]) {
    b b1 = new b();
    b1.compute(5, 7);
  }
}

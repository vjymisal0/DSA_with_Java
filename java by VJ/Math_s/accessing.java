import math_s.math_s.*;

class accessing {

  public static void main(String args[]) {
    Addition a1 = new Addition();
    Subtraction s1 = new Subtraction();
    int m = a1.add(100, 200);
    int n = a1.sub(200, 100);
    System.out.println("Addition of Two Numbers: " + m);
    System.out.println("Subtraction of TWo Numbers: " + n);
  }
}

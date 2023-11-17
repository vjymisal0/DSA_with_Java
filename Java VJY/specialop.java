import java.util.*;

//instanceof opeartor is used to chech if the given object is of that respective class
class specialop {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    Scanner sc = null;
    if (sc instanceof Scanner) {
      System.out.println("S is an Object of Scanner Class");
    } else {
      System.out.println("S is not an Object of Scanner class");
    }
  }
}

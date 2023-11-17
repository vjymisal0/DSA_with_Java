//simple vector program
import java.util.*;

class cmdvector {

  public static void main(String args[]) {
    Vector v1 = new Vector();
    for (int i = 0; i < args.length; i++) {
      v1.addElement(args[i]);
    }
    System.out.println("Vector Size: " + v1.size());
    System.out.println("Given Vector Elements: ");
    for (int j = 0; j < v1.size(); j++) {
      System.out.println(
        "Element Present at Index " + j + " is: " + v1.elementAt(j)
      );
    }
  }
}

/*write a program to create vector with seven elements (10,30,60,70,80,100). Remove element 3rd and 4th position. Insert new element at 3rd position. Display the original and current size of vector.*/
import java.util.*;

class firstvector {

  public static void main(String args[]) {
    Vector v1 = new Vector();
    int i = 10;
    v1.addElement(new Integer(10));
    v1.addElement(new Integer(30));
    v1.addElement(new Integer(60));
    v1.addElement(new Integer(70));
    v1.addElement(new Integer(80));
    v1.addElement(new Integer(100));
    System.out.println("Initial Size of Vector: " + v1.size());
    v1.removeElementAt(3);
    v1.removeElementAt(4);
    v1.insertElementAt(new Integer(150), 3);
    System.out.println("Final Size of Vector: " + v1.size());
  }
}

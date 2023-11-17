//Write a java program to calculate Area of Circle
import java.util.Scanner;

class java8 {

  public static void main(String args[]) {
    int radius;
    float PI = 3.14f;
    float area;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Radius of Circle: ");
    radius = s.nextInt();
    area = (PI * radius * radius);
    System.out.println("Area of Circle: " + area);
  }
}

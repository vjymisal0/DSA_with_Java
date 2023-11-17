//BufferedReader class Demo
import java.io.*;

class java6 {

  public static void main(String args[]) throws IOException {
    int a, b;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter First Number: ");
    a = Integer.parseInt(br.readLine());
    System.out.println("Enter Second Number: ");
    b = Integer.parseInt(br.readLine());
    if (a == b) {
      System.out.println("Both Numbers are Equal!");
    }
    System.out.println("End of Program...");
  }
}

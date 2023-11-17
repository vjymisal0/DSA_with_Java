//else-if ladder
import java.util.*;

class java17 {

  public static void main(String args[]) {
      int no;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter any Number: ");
      no=s.nextInt();
      if(no>=75)
      System.out.println("Congress: you got distinction");
      else if(no>=60)
      System.out.println("Congress: you got First Class");
      else if(no>=40)
      System.out.println("Congress: you are pass");
      else
      System.out.println("You are failed!");
  }
}

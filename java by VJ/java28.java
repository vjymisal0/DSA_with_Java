import java.util.Scanner;

//write a java program to print fibonacci series
class java28 {

  public static void main(String args[]) {
    int fno = 0, sno = 1, tno, no;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any number: ");
    no = s.nextInt();
    System.out.println("Fibonacci Series: " + fno + " " + sno);
    for(int i=3;i<=no;i++)
    {
        tno=fno+sno;
        System.out.println(" "+tno);
        fno=sno;
        sno=tno;   
    }
   
  }
}

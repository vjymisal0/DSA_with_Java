//write a java program to swap two numbers
import java.util.*;
class swap {
    public static void main(String args[])
    {
        int a, b, temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        a=s.nextInt();
        System.out.println("Enter Second Number: ");
        b=s.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping value of a and b: ");
        System.out.println("A: "+a+" B: "+b);

    }
}

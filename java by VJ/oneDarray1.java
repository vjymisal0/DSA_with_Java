//reverse order: 
import java.util.*;
class oneDarray1 {
    public static void main(String args[])
    {
        int a[]=new int[5];
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Array Elements: ");
        for(i=0;i<5;i++)
        {
            a[i]=s.nextInt();

        }
        System.out.println("Reverse Order Array Elements: ");
        for(i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}

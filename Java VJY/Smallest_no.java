//write a java program to find smallest among given two numbers using greater than operator
import java.io.*;
class Smallest_no{
	public static void main(String args[])throws IOException
	{
		int a,b;
		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Number: ");
		a=Integer.parseInt(b1.readLine());
		System.out.println("Enter Second Number: ");
		b=Integer.parseInt(b1.readLine());
		if(a>b)
		{
			System.out.println("Smallest Number: "+b);
		}
		else
		{
			System.out.println("Smallest Number: "+a);
		}
	}
}
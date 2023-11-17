//class and object in java
class vijay{
		int a,b,c;
		void add()
		{
			a=500;
			b=500;
		}
		void calc_add()
		{
			c=a+b;
			System.out.println("Addition: "+c);
		}
		public static void main(String args[])
		{
			vijay va=new vijay(); //instantiation of an object
			va.add();
			va.calc_add();
	}
}
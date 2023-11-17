class A{
   int a; String b;
    int c; String d;
   A()
   {
       a=10;
       b="Vijay";
   } 
   A(A ref)
   {
        c=ref.a;
        d=ref.b;
        System.out.println(c+" "+d);
   }
}
class B{
    public static void main(String args[])
    {
        A p=new A();
        A p1=new A(p);
    }
}
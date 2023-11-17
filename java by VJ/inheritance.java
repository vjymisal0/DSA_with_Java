class inheritance {

  int a=10;
}
class position extends inheritance{
    int b=33;
    public static void main(String args[])
    {
        position p1=new position();
        System.out.println("A: "+p1.a);
        System.out.println("B: "+p1.b);
    }
}


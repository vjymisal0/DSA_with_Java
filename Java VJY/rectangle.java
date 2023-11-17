//default constructor
//parameterizz
class rectangle {
    int length, width;
   /* rectangle()
    {
        length=10;
        width=4;
    }*/
    rectangle(int a,int b)
    {
        length=a;
        width=b;
    }
    void display()
    {
        System.out.println("Area of Rectangle: "+(length*width));

    }
    public static void main(String args[])
    {
        rectangle r1=new rectangle(20,12);
        r1.display();
    }
}

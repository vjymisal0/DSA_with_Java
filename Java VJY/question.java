import java.util.*;
interface exam{
    void per_cal();

}
class student{
    String name;
    int rollno;
    int m1;
    int m2;
    void get_stud_info()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        name=s.next();
        System.out.println("Enter Student Roll No: ");
        rollno=s.nextInt();
        System.out.println("Enter Subject-1 Marks: ");
        m1=s.nextInt();
        System.out.println("Enter Subject-2 Marks: ");
        m2=s.nextInt();
    }
}
class question extends student implements exam{
    float percentage;
    public void per_cal()
    {
        percentage=(float)(m1+m2)/2;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollno);
        System.out.println("Test-1 Marks: "+m1);
        System.out.println("Test-2 Marks: "+m2);
        System.out.println("Percentage: "+percentage);
    }
    public static void main(String args[])
    {
        question q1=new question();
        q1.get_stud_info();
        q1.per_cal();
        q1.display();
    }
}

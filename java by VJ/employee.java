/*

*/
import java.util.*;
class employee {
    int empid;
    String emp_name;
    float salary;
    void get_emp_details()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        empid=s.nextInt();
        System.out.println("Enter Employee Name: ");
        emp_name=s.next();
        System.out.println("Enter Employee Salary: ");
        salary=s.nextFloat();
    }    
    void disp_emp_details()
    {
        System.out.println(empid+"\t"+emp_name+"\t"+salary);
    }
    public static void main(String args[])
    {
        employee e1=new employee();
        employee e2=new employee();
        e1.get_emp_details();
        e2.get_emp_details();
        e1.disp_emp_details();
        e2.disp_emp_details();
    }
}

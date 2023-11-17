import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private int age;
    private double annualIncome;
    private double tax;

    public Employee(int empId, String empName, int age, double annualIncome) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.annualIncome = annualIncome;
        this.tax = 0.0; // Initialize tax to 0
    }

    public void calculateIncomeTax() {
        if (annualIncome <= 500000) {
            tax = 0.0;
        } else if (annualIncome <= 1000000) {
            tax = (annualIncome - 500000) * 0.10;
        } else if (annualIncome <= 5000000) {
            tax = 500000 * 0.10 + (annualIncome - 1000000) * 0.20;
        } else {
            tax = 500000 * 0.10 + 4000000 * 0.20 + (annualIncome - 5000000) * 0.30;
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Age: " + age);
        System.out.println("Annual Income: Rs. " + annualIncome);
        System.out.println("Income Tax: Rs. " + tax);
    }
}

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.println("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.println("Enter Age: ");
        int age = scanner.nextInt();

        System.out.println("Enter Annual Income: ");
        double annualIncome = scanner.nextDouble();

        Employee employee = new Employee(empId, empName, age, annualIncome);
        employee.calculateIncomeTax();
        employee.displayEmployeeDetails();

        scanner.close();
    }
}

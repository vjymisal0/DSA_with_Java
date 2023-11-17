class Employee {
    private String emp_id;
    private String emp_name;
    private int age;
    private double salary;
    private double employeeContribution;
    private double employerContribution;

    public Employee(String emp_id, String emp_name, int age, double salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.age = age;
        this.salary = salary;
        calculatePensionContributions();
    }

    private void calculatePensionContributions() {
        if (age <= 55) {
            employeeContribution = (20.0 / 100) * salary;
            employerContribution = (17.0 / 100) * salary;
        } else if (age <= 60) {
            employeeContribution = (13.0 / 100) * salary;
            employerContribution = (13.0 / 100) * salary;
        } else if (age <= 65) {
            employeeContribution = (9.0 / 100) * salary;
            employerContribution = (7.5 / 100) * salary;
        } else {
            employeeContribution = (5.0 / 100) * salary;
            employerContribution = (7.5 / 100) * salary;
        }
    }

    public void displayPensionContributions() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: $" + salary);
        System.out.println("Employee Contribution: $" + employeeContribution);
        System.out.println("Employer Contribution: $" + employerContribution);
        System.out.println("Total Pension Contribution: $" + (employeeContribution + employerContribution));
    }
}

public class Practical5 {
    public static void main(String[] args) {
        // Input employee details
        String emp_id = "E001";
        String emp_name = "John Doe";
        int age = 58;
        double salary = 60000.0;

        // Create an Employee object
        Employee employee = new Employee(emp_id, emp_name, age, salary);

        // Display the results
        employee.displayPensionContributions();
    }
}

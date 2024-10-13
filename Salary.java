import java.util.Scanner;

class Employee {
    int emp_id;
    String emp_name;
    double basic_salary;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        emp_id = sc.nextInt();
        System.out.print("Enter Employee Name: ");
        emp_name = sc.next();
        System.out.print("Enter Basic Salary: ");
        basic_salary = sc.nextDouble();
    }

     void displayGrossSalary() {
        double gross_salary = basic_salary + (0.25* basic_salary);
        System.out.println("Gross Salary : " + gross_salary);
    }
}

public class Salary{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.input();
        emp.displayGrossSalary();
    }
}

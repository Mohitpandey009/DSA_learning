package Comparators.Comparator;
import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ram", 55000);
        employees[1] = new Employee("Shyam", 72000);
        employees[2] = new Employee("Rahul", 60000);
        employees[3] = new Employee("Rohit", 80000);
        employees[4] = new Employee("Rajkaran", 65000);

        List<Employee> empList = Arrays.asList(employees);

        empList.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));

        for (Employee emp : empList) {
            System.out.println(emp.getName());
        }
    }
}

package Coursework;

import java.util.Objects;

public class Employee {

    private static int idCounter = 1;
    private String name;
    private int employeeSalary;
    private int department;
    public int id;

    public Employee(String name, int department) {
        this.name = name;
        this.department = department;
        int salary = 50_000 + (int) (Math.random() * 100_000);
        this.employeeSalary = employeeSalary + salary;
        this.id = idCounter++;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "[id: " + id + "] Сотрудник (ФИО): " + name + " из отдела №" + department
                + ", его зарплата: " + employeeSalary + " руб.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeSalary == employee.employeeSalary && department == employee.department && id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employeeSalary, department, id);
    }
}





package com.internship.basicProgramming.streams;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private String department;
    private double salary;
    private int age;

    public Employee(String name, String department, double salary, int age) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }
    @Override
    public String toString() {
        return String.format("Employee(name=%s, dept=%s, salary=%.2f", name, department, salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


public class EmployeeLMS {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("David", "IT", 10, 25),
                new Employee("Chaitanya", "finance", 200, 21),
                new Employee("Bobby","admin",30,35),
                new Employee("Eva", "HR", 45,20),
                new Employee("John", "finance", 60,35)
        );
        //finding employees in finance dept having salary > 20
        System.out.println("Employees in finance dept having salary greater than 20");
        employees.stream()
                .filter(emp -> "finance".equals(emp.getDepartment()))
                .filter(emp -> emp.getSalary() > 20)
                .forEach(emp -> System.out.println(emp.toString()));

        // get the names of the employees sorted by salary
        System.out.println("employyes name sorted by salary");
        employees.stream()
                .sorted((e1,e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .map(Employee::getName)
                .forEach(System.out::println);

        // avearge salary by department
        System.out.println("Average salary by department");
        Map<String, Double> avgSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy
                        (Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        avgSalaryByDepartment.forEach((dept, avgSal) -> System.out.println(dept + " " + avgSal));

        // find the highst paid employee
        System.out.println("Highst paid employees");
        Optional<Employee> hightsPaid = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        hightsPaid.ifPresent(emp -> System.out.println(emp.toString()));

        // count the employees by department
        System.out.println("count the employees by department");
        Map<String, Long> countByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        countByDept.forEach((dept, count) -> System.out.println(dept + " " + count));
    }
}

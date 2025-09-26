package com.internship.basicProgramming.oops;

//inteface for payment
interface payable{
    void calculatepay();
}
interface printable{
    void show();
}
class Person{
    private String name;
    private int age;

    //constructor
    Person(){
        System.out.println("Person obj. constructor");
    }
    Person(String name, int age){
        this();
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name: " + name + " Age: " + age);
    }

    //encapsulation
    // getter and setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class StudentOfCollege extends Person{
    private int id;
    StudentOfCollege(String name, int age, int id){
        super(name, age);
        this.id = id;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("student id " + id);
    }
}
class Professor extends Person implements payable, printable{

    private int employeeId;
    private double salary;

    Professor(String name, int age, int employeeId, double salary){
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("professor id " + employeeId);
    }
    @Override
    public void calculatepay() {
        System.out.println("Monthly salary: of " + getName() + " is " + (salary + 1));
    }
    public void teach(String subject){
        System.out.println("Teaching subject " + subject);
    }

    @Override
    public void show() {
        System.out.println("the professor is Good");
    }
}
public class CollegeMS {
    public static void main(String[] args) {
        StudentOfCollege student1 = new StudentOfCollege("david",24,1);
        StudentOfCollege student2 = new StudentOfCollege("cdac",43,2);

        Professor p1 = new Professor("PGDAI", 50, 1011, 10000);
        p1.calculatepay();
        p1.show();
        p1.teach("chemistry");

    }
}

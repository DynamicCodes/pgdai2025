package com.internship.basicProgramming.oops;


class Student{
    String name;
    int id;
    int rollNumber;

    //deafult constructor
//    Student(){
//        System.out.println("I am Student");
//    }

    // describing cosntructor chaining through parametarize constructors
    Student(String name){

    }
    Student(String name, int id){

    }
    Student(String name, int id, int rollNumber){
        this.name = name;
        this.id = id;
        this.rollNumber = rollNumber;
    }
    void display(){
        System.out.println("Name : " + name + " id : " + id + " rollNumber : " + rollNumber);
    }
}



public class BasicClassDemo {
    public static void main(String[] args) {
        Student s1 = new Student("john");


        Student s2 = new Student("david",1);
        Student s3 = new Student("jane",2, 12);


        s1.display();
        s2.display();


        s1 = s2;
        System.out.println(s1.name);
        System.out.println(s2.name);
        s3.display();
    }
}

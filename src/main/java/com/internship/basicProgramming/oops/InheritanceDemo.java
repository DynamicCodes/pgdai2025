package com.internship.basicProgramming.oops;

class Animal {
    private String name;
    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println("eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Dog extends Animal {
    private String breed;
    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    void bark(){
        System.out.println("barking");
    }
}
class Puppy extends Dog{
    private String puppyName;
    Puppy(String name, String breed, String puppyName) {
        super(name, breed);
        this.puppyName = puppyName;
    }
    @Override
    void bark(){
        System.out.println("pew pew");
    }
    @Override
    void eat(){
        System.out.println("time has not arrived for the puppy to eat");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog("Dog", "Lab");
        d1.eat();
        d1.bark();
        System.out.println(d1.getName());

        Puppy p1 = new Puppy("DOG", "Lab", "Puppy");
        p1.bark();
        p1.eat();
    }
}

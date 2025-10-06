package com.internship.basicProgramming.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;


class Animal{
    protected String name;
    private int age;
    public String eat;

    public Animal(){};
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void makeSound(){
        System.out.println("ANimal making sound");
    }
    private void sleep(){
        System.out.println("sleeping");
    }
}
class Dog extends Animal{
    private String breed;

    public Dog(){
        super();
    };
    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }
    @Override
    public void makeSound(){
        System.out.println("Dog making sound:Woof!");
    }
    public void wagTail(){
        System.out.println("Dog wagging tail");
    }
}




public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        //Method 1: using .class syntax
        Class<String> stringClass1 = String.class;

        //Method 2: using class.forName()
        Class<?> stringClass2 = Class.forName("java.lang.String");

        //Method 3: using getClass() method
        String str = "Hello";
        Class<?> stringClass3 = str.getClass();

        //Method 4: for primitive types
        Class<Integer> intClass = int.class;
        Class<Integer> integerClass = Integer.class;

        System.out.println("class name: " + stringClass1.getName());
        System.out.println("class simple name: " + stringClass1.getSimpleName());
        System.out.println("package name: " + stringClass1.getPackage().getName());
        System.out.println("is interface: " + stringClass1.isInterface());
        System.out.println("is Array: " + stringClass1.isArray());
        System.out.println("checkinmg primitive dsatatypes: " + integerClass.isPrimitive());



        // for the Animal class inspection

        Class<?> dogClass = Dog.class;

        //basic information of the class
        System.out.println("basic information");
        System.out.println("class name: " + dogClass.getName());
        System.out.println("package name: " + dogClass.getPackage().getName());
        System.out.println("simple name: " + dogClass.getSimpleName());
        System.out.println("super class details: " + dogClass.getSuperclass().getName());

    // also inspect access modifiers
        int modifiers = dogClass.getModifiers();
        System.out.println("modifiers: " + Modifier.toString(modifiers));
        System.out.println(" is public: " + Modifier.isPublic(modifiers));
        System.out.println(" is protected: " + Modifier.isProtected(modifiers));
        System.out.println(" is private: " + Modifier.isPrivate(modifiers));
        System.out.println("is abstracted class: " + Modifier.isAbstract(modifiers));
        System.out.println("is final: " + Modifier.isFinal(modifiers));

        // interfaces
        Class<?>[] interfaces  = dogClass.getInterfaces();
        System.out.println("intefaces: " + java.util.Arrays.toString(interfaces));

        // fields level inspection
        Dog dog = new Dog("bobby",3,"golden");

        System.out.println("inspect fields");
        // get all the declared fields(including private)
        Field[] allFields = dogClass.getDeclaredFields();
        System.out.println("decalred fields in my class are ");
        for(Field field : allFields){
            System.out.println(field.getName());
            System.out.println(field.getType().getSimpleName());
            Modifier.toString(field.getModifiers());
        }

        //get public fields(including inheritance)
        Field[] publicFields = dogClass.getFields();
        System.out.println("public fields in my class are ");
        for(Field field : publicFields){
            System.out.println(field.getName());
        }

        //setting up access
        Field nameField = dogClass.getSuperclass().getDeclaredField("name");
        nameField.setAccessible(true);
        System.out.println("name : " + nameField.get(dog));


        // Mehtod inspection
        System.out.println("Method reflection demo");
        //get all the declared methods
        Method[] declaredMethods = dogClass.getDeclaredMethods();
        for(Method method : declaredMethods){
            System.out.println(method.getName());
            System.out.println(method.getReturnType().getSimpleName());
            System.out.println(method.getParameterTypes().length);
        }

        // get all the methods inherited
        Method[] allMethods = dogClass.getMethods();
        System.out.println("methods in my inherited class are " + allMethods.length);


    }
}

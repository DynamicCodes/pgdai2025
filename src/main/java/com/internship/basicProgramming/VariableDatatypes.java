package com.internship.basicProgramming;

public class VariableDatatypes {
    public static void main(String[] args) {
        //variable declaration
//        int _var1 = 5;
//        long $var2 = 1000000;
//        float _23var3 = 3.14F;
//        double var4 = 20.23;
//        String var5 = "welcome to Cdac PG-DAI";
//        boolean var6 = true;
//        // showing the output of the variables
//        System.out.println("var1 =  " + _var1);
//        System.out.println("var2 =  " + $var2);
//        System.out.println("var3 =  " + _23var3);
//        System.out.println("var4 =  " + var4);
//        System.out.println("var5 = " + var5);
//        System.out.println("var6 = " + var6);


        // basics of TypeCasting
        // Implicit (widening)
        int myInt = 5;
        double myDouble = myInt;
        System.out.println("MyInt value is " + myInt);
        System.out.println("MyDouble value is " + myDouble);

        //explicit
        double mydouble2 = 9.99;
        int myInt2 = (int)mydouble2;

        System.out.println("MyInt value is " + myInt2);

        //few more examples
        byte myByte = 10;
        int biggerNumber = myByte;

        System.out.println(biggerNumber);

        float myFloat = 5.20f;
        int myint3 = (int)myFloat;

        System.out.println("MyInt value is " + myint3);


    }
}

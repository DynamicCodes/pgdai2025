package com.internship.basicProgramming;

public class StringDemo {
    public static void main(String[] args) {

//        String str1 = "abc";
//        String str2 = "abc";
//        String str3 = new String("abc");
//    // memory location in string pool
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//
//        // interning for string pool
//        str3.intern();
//        System.out.println(str1 == str3);
//
//        String str5 = new String("abc").intern();
//        System.out.println(str5 == str3);
//
//
//         // immutability
//        String str4 = str1.concat(" cbbbc");
//        System.out.println(str1);
//        System.out.println(str4);

        // methods
        String str1 = " Hello  World ";
        String str2 = " Java Programming ";
        String str3 = " HELLO WORLD ";
        String str4 = " abc ";

        // 1. checking the length
        System.out.println("Length is : " + str3.length());

        //2. charAt
        System.out.println("Character at index : " + str1.charAt(5));

        //3. substring
        System.out.println("substring of str1 from index 2 : " + str1.substring(2,5));

        //4. equals
        System.out.println("equals method for checking substring literals " + str1.equals(str3));

        // 5. equalsIgnoreCase
        System.out.println("to check for equals ignoring cases " + str1.equalsIgnoreCase(str3));

        // 6. index of
        System.out.println("checing index of " + str1.indexOf("H"));

        // 7. compareTo
        System.out.println("compare two Strings "  + str4.compareToIgnoreCase(str1));

        // 8. toLowerCase and toUpperCase
        System.out.println(str1.toUpperCase());
        System.out.println(str1);
        System.out.println(str3.toLowerCase());

        // 9. trim() to remove extra spaces in the string literals having prior and after the literals
        System.out.println("trim method " + str1.trim());

        //10. contains, checing whether provided string literal is present or not, answer in true false;
        System.out.println("contains methods " + str1.contains("Hll"));

        //11. replace method
        System.out.println("replace methos to replace a specific Literal " + str1.replace("Hello", "Hi"));

        // lastIndexOf
        System.out.println("checking last index of " + str1.lastIndexOf("o"));


        System.out.println("Reverse a String with the methods we have learned");
        String str6 = "Hello, java programmers, welcome to PGDAI course";
        String rev = "";
        for(int i= str6.length()-1; i>=0; i--){
            rev = rev.concat(String.valueOf(str6.charAt(i)));
        }
        System.out.println(rev);


    }
}

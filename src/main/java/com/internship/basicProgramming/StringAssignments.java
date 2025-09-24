package com.internship.basicProgramming;

import org.w3c.dom.ls.LSOutput;

public class StringAssignments {
    public static void main(String[] args) {
        //Remove Duplicates from a String Example: "programming" → "progamin"
        String str = "Programming";
        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i<str.length(); i++){
            char currentChar = str.charAt(i);

            // checkin id char is present
            if(newStr.indexOf(String.valueOf(currentChar)) == -1){
                newStr.append(currentChar);
            }
        }
        System.out.println(newStr.toString());

        //Find First Non-Repeated Character. Example: "swiss" → First non-repeated = "w"
        String str2 = "swiss";
        char resultChar = nonRepeatingChar(str2);
        System.out.println((resultChar != 0 ? "first non repeating character " + resultChar : "not found" ));



    }
    static char nonRepeatingChar(String str){

        for(int i=0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            if(str.indexOf(currentChar) == str.lastIndexOf(currentChar)){
                return currentChar;
            }
        }
        return 0;
    }
}

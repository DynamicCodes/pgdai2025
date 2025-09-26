package com.internship.basicProgramming;

import java.util.Arrays;

public class ReverseAndRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 7;
        int newK = 7%arr.length;
        System.out.println("before reverse ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("step 1 reverse the entire array");
        reverseArray(arr, 0, arr.length-1);
        System.out.println("step 2 reverse from 0th index to (newK-1)inedx");
        reverseArray(arr, 0, newK-1);
        System.out.println("step 3 reverse from kth index to (n-1)th index");
        reverseArray(arr, newK, arr.length-1);
        System.out.println("after rotation");
        for(int i : arr){
            System.out.print(i + " ");
        }

        //Noble integer problem
        System.out.println("nOBLE INTEGER question");
        int[] array = {-10,1,2,-5,4};
        int res = checkNoble(array);
        System.out.println("number of Noble integers are " + res);
    }
    static int checkNoble(int[] arr){
        int count = 0;
        Arrays.sort(arr); // the array after sorting=> {-10,-5,1,2,4}
        for(int i=0; i<arr.length; i++){
            if(arr[i] == i){
                count++;
            }
        }


        return count;
    }
    static void reverseArray(int[] arr, int start, int end){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

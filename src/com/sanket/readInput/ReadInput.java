package com.sanket.readInput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args){
        String n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
//reading the number of elements from the that we want to enter
        n=sc.nextLine();
//creates an array in the memory of length 10
        String[] array = new String[10];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n.length(); i++)
        {
//reading array elements from the user
            array[i]=sc.nextLine();
        }
        System.out.println("Array elements are: ");
// accessing array elements using the for loop
        for (int i=0; i<n.length(); i++)
        {
            System.out.println(array[i]);
        }
    }
}

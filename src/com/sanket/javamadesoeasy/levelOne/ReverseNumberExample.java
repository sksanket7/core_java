package com.sanket.javamadesoeasy.levelOne;

import java.util.Scanner;

public class ReverseNumberExample {


    public static int reverseNumber(int someNumber){
        int reverse=0;
        int remainder;

        while(someNumber>0){
            remainder=someNumber%10;
            someNumber=someNumber/10;
            reverse=reverse*10+remainder;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number to reverse: ");
        int number = scan.nextInt();
        System.out.println("This is the reversed number: "+reverseNumber(number));




    }
}

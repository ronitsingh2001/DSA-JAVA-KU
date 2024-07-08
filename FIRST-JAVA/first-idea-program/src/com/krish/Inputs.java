package com.krish;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        System.out.print("Enter your roll number : ");
        Scanner input = new Scanner(System.in);
        float rollno = input.nextFloat();
        System.out.println("Your roll number is " + rollno);
    }
}

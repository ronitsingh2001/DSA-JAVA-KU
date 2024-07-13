package com.krish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter number 1: ");
        num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        num2 = input.nextInt();
        System.out.println("Sum is " + (num2 + num1));
    }
}
package com.krish;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }

    static int getSum(int num1, int num2){
        return num2 + num1;
    }

    static void sum() {
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter number 1: ");
        num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        num2 = input.nextInt();
        System.out.println("Sum is " + getSum(num2, num1));
    }
}

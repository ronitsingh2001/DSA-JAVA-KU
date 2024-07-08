package com.krish;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temp in C: ");
        float temp = input.nextFloat();
        System.out.printf("Temp in F is " + ((temp * 9/5) + 32));
    }
}

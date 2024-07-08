package com.krish;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
//        for (int num = 1; num <= number; num++){
//            System.out.print(num + " ");
//        }
        int num = 1;
//        while (num <= number){
//            System.out.print(num + " ");
//            num++;
//        }
        do{
            System.out.print(num + " ");
            num++;
        }while (num <= number);
    }
}

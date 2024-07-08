package com.krish;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;
        while (count <= n){
            int temp = i;
            i = p + i;
            p = temp;
            count++;
        }
        System.out.println(i);
    }
}

package com.krish;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num = 0;
        while (n > 0) {
            num = num * 10 + (n % 10);
            n /= 10;
        }
        System.out.println(num);
    }
}

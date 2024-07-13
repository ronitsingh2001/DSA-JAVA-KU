package com.krish;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a + " " + b);

        String name = "Krish Thakur";
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String name) {
        name = "Ronit Singh";
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}

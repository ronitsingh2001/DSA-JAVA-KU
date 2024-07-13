package com.krish;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun(99);
        fun("Krish");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }
}

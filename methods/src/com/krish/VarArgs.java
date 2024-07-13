package com.krish;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun();
        multiple(2,4,"krish");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...v){

    }
}

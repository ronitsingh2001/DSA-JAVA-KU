package com.krish;

public class Conditionals {
    public static void main(String[] args) {
        int salary = 4000;
        if(salary > 10000){
            salary += 2000;
        }else if(salary > 5000){
            salary += 1500;
        }else{
            salary += 1000;
        }
        System.out.println(salary);
    }
}
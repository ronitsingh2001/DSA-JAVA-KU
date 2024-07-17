package com.krish;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int[][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        for(int[] a : arr2){
            System.out.println(Arrays.toString(a));
        }
        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = input.nextInt();
            }
        }
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}

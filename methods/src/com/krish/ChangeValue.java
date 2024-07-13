package com.krish;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,28,3,99,2};
        chnage(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void chnage(int[] nums){
        nums[0] = 12;
    }
}

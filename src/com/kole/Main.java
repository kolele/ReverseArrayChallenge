package com.kole;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] forwardArray = new int[]{1,2,3};
        reverse(forwardArray);
    }

    public static void reverse(int[] array){
        int[] reversedArray = new int[array.length];
        for (int i= array.length-1;i>-1;i--){
            reversedArray[array.length-1-i] = array[i];
        }
        System.out.println(Arrays.toString(reversedArray));
    }
}

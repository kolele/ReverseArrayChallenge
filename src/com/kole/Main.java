package com.kole;


public class Main {

    public static void main(String[] args) {
        int [] forwardArray = new int[]{14,4,5,7};
        printArray(forwardArray);
        printArray(reverse(forwardArray));
    }

    public static int[] reverse(int[] array){
        int[] tempArray = new int[array.length];
        int tempCounter = array.length-1;
        for (int i=0; i<array.length;i++){
            tempArray[i] = array[tempCounter];
            tempCounter--;
        }return tempArray;
    }

    public static void printArray(int[] array){
        System.out.println("******************************");
        for (int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("******************************");
    }
}

//create temp array with length of passed array
// create int that is one less than array length
// init for loop
// fill temparray with passed array elements at position of counter
// reduce counter by one
package com.emreergovan;

public class TestPassArray {

    public static void main(String[] args) {
        int[] myList = {10, 20};

        System.out.println("Before Swap myList[0]=" + myList[0]);
        System.out.println("Before Swap myList[1]=" + myList[1]);

        swap(myList[0], myList[1]);

        System.out.println("After Swap myList[0]=" + myList[0]);
        System.out.println("After Swap myList[1]=" + myList[1]);

        System.out.println("Before swapFirstTwoInArray myList[0]=" + myList[0]);
        System.out.println("Before swapFirstTwoInArray myList[1]=" + myList[1]);

        swapFirstTwoInArray(myList);

        System.out.println("After swapFirstTwoInArray myList[0]=" + myList[0]);
        System.out.println("After swapFirstTwoInArray myList[1]=" + myList[1]);

    }

    public static void swap(int n1, int n2) {

        System.out.println("\t Begin Swap n1=" + n1);
        System.out.println("\t Begin Swap n2=" + n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("\t End Swap n1=" + n1);
        System.out.println("\t End Swap n2=" + n2);

    }

    public static void swapFirstTwoInArray(int[] array) {
        System.out.println("\t Begin swapFirstTwoInArray array[0]=" + array[0]);
        System.out.println("\t Begin swapFirstTwoInArray array[1]=" + array[1]);

        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;

        System.out.println("\t End swapFirstTwoInArray array[0]=" + array[0]);
        System.out.println("\t End swapFirstTwoInArray array[1]=" + array[1]);
    }
}

package com.sharyi_dmytro.practice.additional_tasks;

import java.util.Arrays;

public class DoubleArrayFiller {

    public static void main(String[] args) {
        DoubleArrayFiller doubleArray = new DoubleArrayFiller();
        int[][] testArray = doubleArray.getFilledArray(3, 3);
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(Arrays.toString(testArray[i]));
        }
    }

    public int[][] getFilledArray(int x, int y) {
        int[][] resultArray = new int[y][x];
        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray.length; j++) {
                resultArray[i][j]=j+1;
            }

        }
        return resultArray;
    }
}
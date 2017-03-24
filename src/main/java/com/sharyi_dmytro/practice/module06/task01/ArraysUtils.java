package com.sharyi_dmytro.practice.module06.task01;

import java.util.Arrays;

public final class ArraysUtils {

    private ArraysUtils() {
    }

    public static void printSumOfArray(int[] intArr) {
        int resultSumOfArrayInt = 0;
        for (int j = 0; j < intArr.length; j++) {
            resultSumOfArrayInt += intArr[j];
        }
        System.out.println("Суммма массива = " + resultSumOfArrayInt);
    }


    public static void printMinMaxOfArray(int[] intArr) {
        Arrays.sort(intArr);
        System.out.println("Минимальное значение массива = " + intArr[0]);
        System.out.println("Максимальное значение массива = " + intArr[intArr.length - 1]);

    }


    public static void printMaxPositiveOfArray(int[] intArr) {
        Arrays.sort(intArr);
        if (intArr[intArr.length - 1] <= 0) {
            System.out.println("В этом массиве нету положительных элементов");
        } else {
            System.out.println("Максимальное положительное значение = " + intArr[intArr.length - 1]);

        }

    }


    public static void printMultiplicationOfArray(int[] intArr) {
        int resultMultOfArrayInt = 1;
        for (int j = 0; j < intArr.length; j++) {
            resultMultOfArrayInt *= intArr[j];
        }
        System.out.println("Произведение всех элементов массива = " + resultMultOfArrayInt);
    }


    public static void printModulusFirstAndLastElementsOfArray(int[] intArr) {

        if (intArr[0] < 0) {
            intArr[0] *= -1;
        } else {
            intArr[0] = intArr[0];

        }
        if (intArr[intArr.length - 1] < 0) {
            intArr[intArr.length - 1] *= -1;
        } else {
            intArr[intArr.length - 1] = intArr[intArr.length - 1];

        }
        System.out.println("Модуль первого элемента массива = " + intArr[0]);
        System.out.println("Модуль последнего элемента массива = " + intArr[intArr.length - 1]);
    }


    public static void printSecondLargestElementOfArray(int[] intArr) {
        Arrays.sort(intArr);
        System.out.println("Второе максимальное значение массива = " + intArr[intArr.length - 2]);


    }

    public static int[] reverse(int[] array) {
        int[] newReverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newReverseArray[i] = array[array.length - 1 - i];

        }
        System.out.println(Arrays.toString(newReverseArray));
        return newReverseArray;

    }

    public static int[] addNewElement(int[] array, int number) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = number;
        return newArray;


    }

    public static int[] findEvenElements(int[] array) {
        int[] newFindEvenElementsArray = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newFindEvenElementsArray = addNewElement(newFindEvenElementsArray, array[i]);
            }

        }
        System.out.println(Arrays.toString(newFindEvenElementsArray));
        return newFindEvenElementsArray;


    }

}

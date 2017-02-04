package com.sharyi_dmytro.practice.module02.task01;


import java.util.Arrays;

public class MathMethodsArrays {
    public static void main(String[] args) {
        int[] intArr = {6, 9, -2, 8, 0, -4, -3, -10, 4, 2};
        //int[] intArr = {-1, -3, -10};
        double[] doubleArr = {6.2, 9.1, -2.5, 8.4, 0.9, -4.9, -3.4, -10.3, 4.5, 2.1};

        MathMethodsArrays mathMethodsArrays = new MathMethodsArrays();
        mathMethodsArrays.printSumOfArray(intArr);
        mathMethodsArrays.printSumOfArray(doubleArr);
        mathMethodsArrays.printMinMaxOfArray(intArr);
        mathMethodsArrays.printMinMaxOfArray(doubleArr);
        mathMethodsArrays.printMaxPositiveOfArray(intArr);
        mathMethodsArrays.printMaxPositiveOfArray(doubleArr);
        mathMethodsArrays.printMultiplicationOfArray(intArr);
        mathMethodsArrays.printMultiplicationOfArray(doubleArr);
        mathMethodsArrays.printModulusFirstAndLastElementsOfArray(intArr);
        mathMethodsArrays.printModulusFirstAndLastElementsOfArray(doubleArr);
        mathMethodsArrays.printSecondLargestElementOfArray(intArr);
        mathMethodsArrays.printSecondLargestElementOfArray(doubleArr);

    }

    public void printSumOfArray(int[] intArr) {
        int resultSumOfArrayInt = 0;
        for (int j = 0; j < intArr.length; j++) {
            resultSumOfArrayInt += intArr[j];
        }
        System.out.println("Суммма массива = " + resultSumOfArrayInt);
    }

    public void printSumOfArray(double[] doubleArr) {
        double resultSumOfArrayDouble = 0;
        for (int j = 0; j < doubleArr.length; j++) {
            resultSumOfArrayDouble += doubleArr[j];
        }
        System.out.println("Суммма массива = " + resultSumOfArrayDouble);
    }

    public void printMinMaxOfArray(int[] intArr) {
        Arrays.sort(intArr);
        System.out.println("Минимальное значение массива = " + intArr[0]);
        System.out.println("Максимальное значение массива = " + intArr[intArr.length - 1]);

    }

    public void printMinMaxOfArray(double[] doubleArr) {
        Arrays.sort(doubleArr);
        System.out.println("Минимальное значение массива = " + doubleArr[0]);
        System.out.println("Максимальное значение массива = " + doubleArr[doubleArr.length - 1]);

    }

    public void printMaxPositiveOfArray(int[] intArr) {
        Arrays.sort(intArr);
        if (intArr[intArr.length - 1] <= 0) {
            System.out.println("В этом массиве нету положительных элементов");
        } else {
            System.out.println("Максимальное положительное значение = " + intArr[intArr.length - 1]);

        }

    }

    public void printMaxPositiveOfArray(double[] doubleArr) {
        Arrays.sort(doubleArr);
        if (doubleArr[doubleArr.length - 1] <= 0) {
            System.out.println("В этом массиве нету положительных элементов");
        } else {
            System.out.println("Максимальное положительное значение = " + doubleArr[doubleArr.length - 1]);

        }
    }

    public void printMultiplicationOfArray(int[] intArr) {
        int resultMultOfArrayInt = 1;
        for (int j = 0; j < intArr.length; j++) {
            resultMultOfArrayInt *= intArr[j];
        }
        System.out.println("Произведение всех элементов массива = " + resultMultOfArrayInt);
    }

    public void printMultiplicationOfArray(double[] doubleArr) {
        double resultMultOfArrayDouble = 1;
        for (int j = 0; j < doubleArr.length; j++) {
            resultMultOfArrayDouble *= doubleArr[j];
        }
        System.out.println("Произведение всех элементов массива = " + resultMultOfArrayDouble);
    }

    public void printModulusFirstAndLastElementsOfArray(int[] intArr) {

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

    public void printModulusFirstAndLastElementsOfArray(double[] doubleArr) {
        if (doubleArr[0] < 0) {
            doubleArr[0] *= -1;
        } else {
            doubleArr[0] = doubleArr[0];

        }
        if (doubleArr[doubleArr.length - 1] < 0) {
            doubleArr[doubleArr.length - 1] *= -1;
        } else {
            doubleArr[doubleArr.length - 1] = doubleArr[doubleArr.length - 1];

        }
        System.out.println("Модуль первого элемента массива = " + doubleArr[0]);
        System.out.println("Модуль последнего элемента массива = " + doubleArr[doubleArr.length - 1]);
    }


    public void printSecondLargestElementOfArray(int[] intArr) {
        Arrays.sort(intArr);
        System.out.println("Второе максимальное значение массива = " + intArr[intArr.length - 2]);


    }

    public void printSecondLargestElementOfArray(double[] doubleArr) {
        Arrays.sort(doubleArr);
        System.out.println("Второе максимальное значение массива = " + doubleArr[doubleArr.length - 2]);

    }
}



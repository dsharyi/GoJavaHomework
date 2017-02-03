package com.sharyi_dmytro.practice.module02.task01;


import java.util.Arrays;

public class MathMethodsArrays {
    public static void main(String[] args) {
        int[] intArr = new int[10];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = (int) (Math.random() * 10) - 5;
        }
        double[] doubleArr = new double[10];
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = (Math.random() * 10) - 5;
        }

        MathMethodsArrays mathMethodsArrays = new MathMethodsArrays();
        System.out.println(Arrays.toString(intArr));
        mathMethodsArrays.sum(intArr);
        mathMethodsArrays.sum(doubleArr);
        mathMethodsArrays.minMax(intArr);
        mathMethodsArrays.minMax(doubleArr);
        mathMethodsArrays.maxPositive(intArr);
        mathMethodsArrays.maxPositive(doubleArr);
        mathMethodsArrays.multiplication(intArr);
        mathMethodsArrays.multiplication(doubleArr);
        mathMethodsArrays.modulus(intArr);
        mathMethodsArrays.modulus(doubleArr);
        mathMethodsArrays.secondLargest(intArr);
        mathMethodsArrays.secondLargest(doubleArr);

    }

    public void sum(int[] intArr) {
        int sum = 0;
        for (int j = 0; j < intArr.length; j++) {
            sum += intArr[j];
        }
        System.out.println("Суммма массива = " + sum);
    }

    public void sum(double[] doubleArr) {
        double sum = 0;
        for (int j = 0; j < doubleArr.length; j++) {
            sum += doubleArr[j];
        }
        System.out.println("Суммма массива = " + sum);
    }

    public void minMax(int[] intArr) {
        Arrays.sort(intArr);
        System.out.println("Минимальное значение массива = " + intArr[0]);
        System.out.println("Максимальное значение массива = " + intArr[intArr.length - 1]);

    }

    public void minMax(double[] doubleArr) {
        Arrays.sort(doubleArr);
        System.out.println("Минимальное значение массива = " + doubleArr[0]);
        System.out.println("Максимальное значение массива = " + doubleArr[doubleArr.length - 1]);

    }

    public void maxPositive(int[] intArr) {
        int[] positiveArr = new int[intArr.length];
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] > 0) {
                positiveArr[i] = intArr[i];
            }
        }
        System.out.println("Максимальное положительное значение = " + positiveArr[positiveArr.length - 1]);

    }

    public void maxPositive(double[] doubleArr) {
        double[] positiveArr = new double[doubleArr.length];
        for (int i = 0; i < doubleArr.length; i++) {
            if (doubleArr[i] > 0) {
                positiveArr[i] = doubleArr[i];
            }
        }
        System.out.println("Максимальное положительное значение = " + positiveArr[positiveArr.length - 1]);

    }

    public void multiplication(int[] intArr) {
        int mult = 1;
        for (int j = 0; j < intArr.length; j++) {
            mult *= intArr[j];
        }
        System.out.println("Произведение всех элементов массива = " + mult);
    }

    public void multiplication(double[] doubleArr) {
        double mult = 1;
        for (int j = 0; j < doubleArr.length; j++) {
            mult *= doubleArr[j];
        }
        System.out.println("Произведение всех элементов массива = " + mult);
    }

    public void modulus(int[] intArr) {
        int[] modulusArr = new int[intArr.length];
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < 0) {
                intArr[i] *= -1;
                modulusArr[i] = intArr[i];
                intArr[i] *= -1;
            } else
                modulusArr[i] = intArr[i];

        }
        System.out.println("Модуль первого элемента массива = " + modulusArr[0]);
        System.out.println("Модуль последнего элемента массива = " + modulusArr[modulusArr.length - 1]);
    }

    public void modulus(double[] doubleArr) {
        double[] modulusDouble = new double[doubleArr.length];
        for (int i = 0; i < doubleArr.length; i++) {
            if (doubleArr[i] < 0) {
                doubleArr[i] *= -1;
                modulusDouble[i] = doubleArr[i];
                doubleArr[i] *= -1;
            } else
                modulusDouble[i] = doubleArr[i];
        }

        System.out.println("Модуль первого элемента массива = " + modulusDouble[0]);
        System.out.println("Модуль последнего элемента массива = " + modulusDouble[doubleArr.length - 1]);
    }


    public void secondLargest(int[] intArr) {
        Arrays.sort(intArr);
        System.out.println("Второе максимальное значение массива = " + intArr[intArr.length - 2]);


    }

    public void secondLargest(double[] doubleArr) {
        Arrays.sort(doubleArr);
        System.out.println("Второе максимальное значение массива = " + doubleArr[doubleArr.length - 2]);

    }
}



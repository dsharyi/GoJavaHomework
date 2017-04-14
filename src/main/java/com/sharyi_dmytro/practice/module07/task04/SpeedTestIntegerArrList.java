package com.sharyi_dmytro.practice.module07.task04;


import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class SpeedTestIntegerArrList {
    static void testSpeedIntegerArrList1000() {
        long start = 0;
        long finish = 0;
        long speed = 0;

        List<Integer> integerArrayList = new ArrayList<>();
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            integerArrayList.add(i);

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы Integer ArrayList на 1000 эелементов add= " + speed + " нано секунды");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            integerArrayList.set(i, i);

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы Integer ArrayList на 1000 эелементов set= " + speed + " нано секунды");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            integerArrayList.get(i);

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы Integer ArrayList на 1000 эелементов get= " + speed + " нано секунды");

        start = System.nanoTime();
        for (int i = 999; i >= 0; i--) {
            integerArrayList.remove(i);

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы Integer ArrayList на 1000 эелементов remove= " + speed + " нано секунды");
    }


    //////////////////////////////////////////////////////////
    static void testSpeedIntegerArrList10000() {
        long start = 0;
        long finish = 0;
        long speed = 0;

        List<Integer> integerArrayList = new ArrayList<>();
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            integerArrayList.add(i);

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы Integer ArrayList на 10000 эелементов add= " + speed + " нано секунды");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            integerArrayList.set(i, i);

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы Integer ArrayList на 10000 эелементов set= " + speed + " нано секунды");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            integerArrayList.get(i);

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы Integer ArrayList на 10000 эелементов get= " + speed + " нано секунды");

        start = System.nanoTime();
        for (int i = 9999; i >= 0; i--) {
            integerArrayList.remove(i);

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы Integer ArrayList на 10000 эелементов remove= " + speed + " нано секунды");
    }
}





package com.sharyi_dmytro.practice.module07.task04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by nonal on 14.04.2017.
 */
public class SpeedTestStringLinkList {
    static void testSpeedStringLinkList1000() {
        long start = 0;
        long finish = 0;
        long speed = 0;

        List<String> stringLinkList = new LinkedList<>();
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            stringLinkList.add("i");

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы String LinkedList на 1000 эелементов add= " + speed + " нано секунды");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            stringLinkList.set(i, "i");

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы String LinkedList на 1000 эелементов set= " + speed + " нано секунды");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            stringLinkList.get(i);

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы String LinkedList на 1000 эелементов get= " + speed + " нано секунды");

        start = System.nanoTime();
        for (int i = 999; i >= 0; i--) {
            stringLinkList.remove(i);

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы String LinkedList на 1000 эелементов remove= " + speed + " нано секунды");
    }


    //////////////////////////////////////////////////////////
    static void testSpeedStringLinkList10000() {
        long start = 0;
        long finish = 0;
        long speed = 0;

        List<String> stringArrayList = new ArrayList<>();
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stringArrayList.add("i");

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы String LinkedList на 10000 эелементов add= " + speed + " нано секунды");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stringArrayList.set(i, "i");

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы String LinkedList на 10000 эелементов set= " + speed + " нано секунды");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stringArrayList.get(i);

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы String LinkedList на 10000 эелементов get= " + speed + " нано секунды");

        start = System.nanoTime();
        for (int i = 9999; i >= 0; i--) {
            stringArrayList.remove(i);

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы String LinkedList на 10000 эелементов remove= " + speed + " нано секунды");
    }
}

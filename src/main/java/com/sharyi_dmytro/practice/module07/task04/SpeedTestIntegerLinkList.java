package com.sharyi_dmytro.practice.module07.task04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by nonal on 14.04.2017.
 */
public class SpeedTestIntegerLinkList {
    static void testSpeedIntegerLinkList1000() {
        long start = 0;
        long finish = 0;
        long speed = 0;

        List<Integer> integerLinkList = new LinkedList<>();
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            integerLinkList.add(i);

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы Integer LinkedList на 1000 эелементов add= " + speed + " нано секунды");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            integerLinkList.set(i, i);

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы Integer LinkedList на 1000 эелементов set= " + speed + " нано секунды");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            integerLinkList.get(i);

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы Integer LinkedList на 1000 эелементов get= " + speed + " нано секунды");

        start = System.nanoTime();
        for (int i = 999; i >= 0; i--) {
            integerLinkList.remove(i);

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы Integer LinkedList на 1000 эелементов remove= " + speed + " нано секунды");
    }
    //////////////////////////////////////////////////////////////////////////

    static void testSpeedIntegerLinkList10000() {
        long start = 0;
        long finish = 0;
        long speed = 0;

        List<Integer> integerLinkList = new LinkedList<>();
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            integerLinkList.add(i);

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы Integer LinkedList на 10000 эелементов add= " + speed + " нано секунды");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            integerLinkList.set(i, i);

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы Integer LinkedList на 10000 эелементов set= " + speed + " нано секунды");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            integerLinkList.get(i);

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы Integer LinkedList на 10000 эелементов get= " + speed + " нано секунды");

        start = System.nanoTime();
        for (int i = 9999; i >= 0; i--) {
            integerLinkList.remove(i);

        }
        finish = System.nanoTime();
        speed = finish - start;
        System.out.println("Скорость работы Integer LinkedList на 10000 эелементов remove= " + speed + " нано секунды");
    }
}

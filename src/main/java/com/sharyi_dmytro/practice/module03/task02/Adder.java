package com.sharyi_dmytro.practice.module03.task02;

public class Adder extends Arithmetic {

    Boolean check(Integer a, Integer b) {
        Boolean checkOfIntegers;
        if (a >= b) {
            checkOfIntegers = true;
        } else {
            checkOfIntegers = false;
        }
        return checkOfIntegers;

    }

    /*public static void main(String[] args) {
        Adder math = new Adder();

        System.out.println(math.add(5,6));
        System.out.println(math.check(7,8));*/


}

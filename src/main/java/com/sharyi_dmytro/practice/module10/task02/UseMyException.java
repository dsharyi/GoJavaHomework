package com.sharyi_dmytro.practice.module10.task02;

/**
 * Created by nonal on 28.04.2017.
 */
public class UseMyException {
    public static void main(String[] args) {
        try {
            throw new MyException("");
        }catch (MyException e){
            e.printExceptionMessage();
        }
    }
}

package com.sharyi_dmytro.practice.module10.task05;


import java.lang.*;

public class ThrowExceptions {

   static void throwExceptions() throws NullException, IndexException, java.lang.ArithmeticException {
       if (true){
           throw new NullException("");
       }
       if (true){
           throw new IndexException("");
       }
       if (true){
           throw new ArithmeticException("");
       }

    }

    public static void main(String[] args) {
        try {
            throwExceptions();
        }catch (NullException|IndexException| java.lang.ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}

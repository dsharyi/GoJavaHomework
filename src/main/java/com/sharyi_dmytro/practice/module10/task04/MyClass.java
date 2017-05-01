package com.sharyi_dmytro.practice.module10.task04;

public class MyClass {
   static void f(){
        try {
            g();
        } catch (NewException1 e) {
            try {
                throw new NewException1.NewException2("");
            } catch (NewException1.NewException2 newException2) {
                newException2.printStackTrace();
            }
        }

    }

   static void g() throws NewException1 {
        throw new NewException1("");

    }
}

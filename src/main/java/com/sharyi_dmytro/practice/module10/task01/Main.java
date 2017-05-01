package com.sharyi_dmytro.practice.module10.task01;


public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Выявлено исключение");
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
        finally {
            System.out.println("Блок finally...");
        }

    }


}

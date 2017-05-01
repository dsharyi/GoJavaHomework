package com.sharyi_dmytro.practice.module08.task01;




public class IdGenerator {

    public static int idGenerator(String name, Country country, int expiration) {
        return name.hashCode()+country.ordinal()+expiration;

    }



}

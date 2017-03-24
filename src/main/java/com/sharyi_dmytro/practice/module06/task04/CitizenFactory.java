package com.sharyi_dmytro.practice.module06.task04;


public class CitizenFactory {
    public static Citizen createCitizen(CitizenType citizenType) {
        switch (citizenType) {
            case ENG:
                return new Englishman();
            case CHN:
                return new Chinese();
            case RUS:
                return new Russian();
            case ITA:
                return new Italian();
        }
        return null;


    }

    public enum CitizenType {
        ENG, CHN, RUS, ITA
    }

    private static class Englishman implements Citizen {
        public Englishman(){
            System.out.println(sayHello());

        }

        public String sayHello() {
            return "Hello";
        }
    }

    private static class Chinese implements Citizen {
        public Chinese(){
            System.out.println(sayHello());
        }

        public String sayHello() {
            return "Nihao";
        }
    }

    private static class Russian implements Citizen {
        public Russian(){
            System.out.println(sayHello());
        }

        public String sayHello() {
            return "Привет";
        }
    }

    private static class Italian implements Citizen {
        public Italian(){
            System.out.println(sayHello());
        }

        public String sayHello() {
            return "Ciao";
        }
    }


}

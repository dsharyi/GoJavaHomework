package com.sharyi_dmytro.practice.module03.task01;


public class Bird {

    public static void main(String[] args) {

        Bird birdVoody = new Bird("Voody");
        birdVoody.sing();
        //Bird bird = new Bird();
        //bird.sing();


    }


    private static final String[] SONG = new String[]{"I am walking",
            "I am flying",
            "I am singing",
            "I am Bird"};


    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public Bird() {
    }

    @Override
    public String toString() {
        return "I am walking \n" +
                "I am flying \n" +
                "I am singing \n" +
                "I am Bird";
    }


    void sing() {
        if (name == null) {
            System.out.println(toString());


        } else {
            System.out.println("I am " + name + "\n" + toString());

        }


    }
}

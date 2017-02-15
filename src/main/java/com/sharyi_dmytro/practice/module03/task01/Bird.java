package com.sharyi_dmytro.practice.module03.task01;


public class Bird {

    public static void main(String[] args) {

        //Bird birdVoody = new Bird("Voody");
        //birdVoody.sing();
        Bird bird = new Bird();
        bird.sing();


    }


    private static final String SONG = "I am walking \n" +
            "I am flying \n" +
            "I am singing \n" +
            "I am Bird";


    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public Bird() {
    }



    public void sing() {
        if (name == null) {
            System.out.println(SONG);


        } else {
            System.out.println("I am " + name + "\n" + SONG);

        }


    }
}

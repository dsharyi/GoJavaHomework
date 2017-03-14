package com.sharyi_dmytro.practice.module05.task01;

import com.sharyi_dmytro.practice.module05.task01.api.BookingComAPI;
import com.sharyi_dmytro.practice.module05.task01.api.GoogleAPI;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.requestRooms(600, 4, "London", "Hilton");
        controller.requestRooms(200, 2, "London", "Hilton");
        //controller.requestRooms(100, 2, "Berlin", "Hyatt");




    }

}

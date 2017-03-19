package com.sharyi_dmytro.practice.module05.task07;

import com.sharyi_dmytro.practice.module05.task01_02.Room;
import com.sharyi_dmytro.practice.module05.task04.BookingComAPI;
import com.sharyi_dmytro.practice.module05.task04.TripAdvisorAPI;
import com.sharyi_dmytro.practice.module05.task05.RoomDAOUse;
import com.sharyi_dmytro.practice.module05.task06.Controller;

import java.util.Date;


public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        RoomDAOUse roomDAOUse = new RoomDAOUse();
        roomDAOUse.save(new Room(12,200,2,new Date(),"Ukraine","Dnipro"));
        controller.requestRooms(600, 4, "London", "Hilton");
        controller.requestRooms(2200, 5, "Berlin", "Hyatt");
        //controller.requestRooms(7800, 2, "Berlin", "Hyatt");
        //controller.check(new BookingComAPI(), new TripAdvisorAPI());




    }

}

package com.sharyi_dmytro.practice.module05.task01.api;

import com.sharyi_dmytro.practice.module05.task01.Room;

import java.util.Arrays;
import java.util.Date;


public class BookingComAPI implements API {


    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(i, 100 * i, 1 + i, new Date(), "Hyatt", "Berlin");

        }
    }


    public Room[] findRooms(int price, int persons, String city, String hotel) {

        Room[] newRooms = new Room[rooms.length];
        int count = 0;


        for (int i = 0; i < rooms.length; i++) {
            if (price == rooms[i].getPrice() && persons == rooms[i].getPersons() && city.equals(rooms[i].getCityName()) && hotel.equals(rooms[i].getHotelName())) {
                newRooms[count] = rooms[i];
                count++;


            }


        }

        return newRooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}

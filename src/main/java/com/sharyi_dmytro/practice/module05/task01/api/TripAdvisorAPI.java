package com.sharyi_dmytro.practice.module05.task01.api;


import com.sharyi_dmytro.practice.module05.task01.Room;
import com.sharyi_dmytro.practice.module05.task01.api.API;

import java.util.Arrays;
import java.util.Date;

public class TripAdvisorAPI implements API {

    Room[] rooms = new Room[5];

    public TripAdvisorAPI() {

        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(i + 1, 150 * i, 2 + i, new Date(), "Hilton", "London");

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


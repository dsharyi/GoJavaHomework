package com.sharyi_dmytro.practice.module05.task04;


import com.sharyi_dmytro.practice.module05.task01_02.Room;
import com.sharyi_dmytro.practice.module05.task03.API;
import com.sharyi_dmytro.practice.module05.task05.RoomDAOUse;

import java.util.Arrays;
import java.util.Date;

import static com.sharyi_dmytro.practice.module05.task05.RoomDAOUse.addNewElement;

public class TripAdvisorAPI implements API {

    Room[] rooms = new Room[5];


    public TripAdvisorAPI() {

        rooms[0] = new Room(11,200,1,new Date(),"Peremoga","Lviv");
        rooms[1] = new Room(12,800,2,new Date(),"Ukraine","Dnipro");
        rooms[2] = new Room(13,1200,4,new Date(),"Hyatt","London");
        rooms[3] = new Room(14,2200,5,new Date(),"Hilton","Berlin");
        rooms[4] = new Room(15,3200,8,new Date(),"Hilton","Paris");

        //System.out.println(Arrays.toString(rooms));

        }


    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] newRooms = new Room[0];



        for (int i = 0; i < rooms.length; i++) {
            if (price == rooms[i].getPrice() && persons == rooms[i].getPersons() && city.equals(rooms[i].getCityName()) && hotel.equals(rooms[i].getHotelName())) {
                newRooms = addNewElement(newRooms, rooms[i]);


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


package com.sharyi_dmytro.practice.module05.task01;

import java.util.Arrays;
import java.util.Date;


public class BookingComAPI implements API {


    private static Room[] rooms;
    public BookingComAPI(){
        Room[] rooms = new Room[5];
        for (int i = 0; i <rooms.length ; i++) {
            rooms[i]=new Room(i,100*i,1+i,new Date(),"Hilton","London");

        }

    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {

        for (int i = 0; i < rooms.length; i++) {
            if (price == rooms[i].getPrice() && persons == rooms[i].getPersons() && city.equals(rooms[i].getCityName()) && hotel.equals(rooms[i].getHotelName()));
                Room.addRoomFromRequestToArray(rooms,rooms[i]);
            }
            return null;
        }
    }

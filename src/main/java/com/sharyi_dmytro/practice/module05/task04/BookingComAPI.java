package com.sharyi_dmytro.practice.module05.task04;

import com.sharyi_dmytro.practice.module05.task01_02.Room;
import com.sharyi_dmytro.practice.module05.task03.API;

import java.util.Date;

import static com.sharyi_dmytro.practice.module05.task05.RoomDAOUse.addNewElement;


public class BookingComAPI implements API {


    private Room[] rooms = new Room[5];


    public BookingComAPI() {
        rooms[0] = new Room(1, 200, 1, new Date(), "Peremoga", "Lviv");
        rooms[1] = new Room(2, 800, 2, new Date(), "Ukraine", "Dnipro");
        rooms[2] = new Room(3, 600, 4, new Date(), "Hilton", "London");
        rooms[3] = new Room(4, 2200, 5, new Date(), "Hyatt", "Berlin");
        rooms[4] = new Room(5, 3200, 8, new Date(), "Hilton", "Paris");

        //System.out.println(Arrays.toString(rooms));
    }


    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] newRooms = new Room[0];


        for (int i = 0; i < rooms.length; i++) {
            if (price == rooms[i].getPrice() && persons == rooms[i].getPersons() && city.equals(rooms[i].getCityName()) && hotel.equals(rooms[i].getHotelName())) {
                newRooms = addNewElement(newRooms, rooms[i]);


            }


        }
        //System.out.println("Array = " + Arrays.toString(newRooms));

        return newRooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}

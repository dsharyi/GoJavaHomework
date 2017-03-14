package com.sharyi_dmytro.practice.module05.task01;

import com.sharyi_dmytro.practice.module05.task01.api.API;
import com.sharyi_dmytro.practice.module05.task01.api.BookingComAPI;
import com.sharyi_dmytro.practice.module05.task01.api.GoogleAPI;
import com.sharyi_dmytro.practice.module05.task01.api.TripAdvisorAPI;

import java.util.Arrays;


public class Controller {
    private API apis[] = new API[3];

    {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        Room[] newBookComAPI = new Room[5];
        Room[] newGoogleAPI = new Room[5];
        Room[] newTripAdvisorAPI = new Room[5];
        Room[] allRoomsAPI = new Room[newBookComAPI.length + newGoogleAPI.length + newTripAdvisorAPI.length];

        for (int i = 0; i < apis.length; i++) {
            switch (i) {
                case 0:
                    newBookComAPI=apis[0].findRooms(price, persons, city, hotel);
                    System.out.println("BookingComAPI find rooms: " + Arrays.toString(newBookComAPI));
                    break;
                case 1:
                    newGoogleAPI = new GoogleAPI().findRooms(price, persons, city, hotel);
                    System.out.println("GoogleAPI find rooms: " + Arrays.toString(newGoogleAPI));
                    break;
                case 2:
                    newTripAdvisorAPI = new TripAdvisorAPI().findRooms(price, persons, city, hotel);
                    System.out.println("TripAdvisorAPI find rooms: " + Arrays.toString(newTripAdvisorAPI));
                    break;
            }
            System.arraycopy(newBookComAPI, 0, allRoomsAPI, 0, 5);
            System.arraycopy(newGoogleAPI, 0, allRoomsAPI, 5, 5);
            System.arraycopy(newTripAdvisorAPI, 0, allRoomsAPI, 10, 5);
            System.out.println("All API find rooms: " + Arrays.toString(allRoomsAPI));

        }

        return allRoomsAPI;


        //Room[] check(API api1, API api2)
        //{
        //    int count = 0;
        //    Room[] checkRooms = new Room[10];
//
        //}
    }
}

package com.sharyi_dmytro.practice.module05.task06;

import com.sharyi_dmytro.practice.module05.task01_02.Room;
import com.sharyi_dmytro.practice.module05.task03.API;
import com.sharyi_dmytro.practice.module05.task04.BookingComAPI;
import com.sharyi_dmytro.practice.module05.task04.GoogleAPI;
import com.sharyi_dmytro.practice.module05.task04.TripAdvisorAPI;

import java.util.Arrays;

import static com.sharyi_dmytro.practice.module05.task05.RoomDAOUse.addNewElement;


public class Controller {
    private API apis[] = new API[3];
    private Room bookingComAPIRequestRooms[] = new Room[0];
    private Room googleAPIRequestRooms[] = new Room[0];
    private Room tripAdvisorAPIRequestRooms[] = new Room[0];
    private Room[] allRequestRooms = new Room[bookingComAPIRequestRooms.length + googleAPIRequestRooms.length + tripAdvisorAPIRequestRooms.length];

    {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }


    public Room[] requestRooms(int price, int persons, String city, String hotel) {

        /*for (int i = 0; i < apis.length; i++) {
            if (apis[0].findRooms(price, persons, city, hotel) != null) {
                bookingComAPIRequestRooms = apis[0].findRooms(price, persons, city, hotel);
                System.out.println(bookingComAPIRequestRooms[i]);
            }
            if (apis[1].findRooms(price, persons, city, hotel) != null) {
                googleAPIRequestRooms = apis[1].findRooms(price, persons, city, hotel);
                System.out.println(googleAPIRequestRooms[i]);
            }
            if (apis[2].findRooms(price, persons, city, hotel) != null) {
                tripAdvisorAPIRequestRooms = apis[1].findRooms(price, persons, city, hotel);
                System.out.println(tripAdvisorAPIRequestRooms[i]);
            }
            */
        for (int i = 0; i < apis.length; i++) {
            switch (i) {
                case 0:
                    bookingComAPIRequestRooms = apis[0].findRooms(price, persons, city, hotel);
                    //System.out.println("BookingComAPI find such rooms: " + Arrays.toString(bookingComAPIRequestRooms));
                    break;

                case 1:
                    googleAPIRequestRooms = apis[1].findRooms(price, persons, city, hotel);
                    //System.out.println("GoogleAPI find such rooms: " + Arrays.toString(googleAPIRequestRooms));
                    break;

                case 2:
                    tripAdvisorAPIRequestRooms = apis[2].findRooms(price, persons, city, hotel);
                    //System.out.println("TripAdvisorAPI find such rooms: " + Arrays.toString(tripAdvisorAPIRequestRooms));
                    break;
            }


        }
        //allRequestRooms = Arrays.copyOf(bookingComAPIRequestRooms,bookingComAPIRequestRooms.length+1);
        //allRequestRooms = Arrays.copyOf(googleAPIRequestRooms,googleAPIRequestRooms.length+1);
        //allRequestRooms = Arrays.copyOf(tripAdvisorAPIRequestRooms,allRequestRooms.length+1);


        System.out.println(Arrays.toString(bookingComAPIRequestRooms));
        System.out.println(Arrays.toString(googleAPIRequestRooms));
        System.out.println(Arrays.toString(tripAdvisorAPIRequestRooms));

        //System.out.println(Arrays.toString(allRequestRooms));
        return allRequestRooms;
    }


    public Room[] check(API api1, API api2) {
        Room[] checkRooms = new Room[0];
        for (int i = 0; i < api1.getRooms().length; i++) {
            for (int j = 0; j < api2.getRooms().length; j++) {
                if (api1.getRooms()[i].equals(api2.getRooms()[j])) {
                    checkRooms = addNewElement(checkRooms,api1.getRooms()[i]);
                    checkRooms = addNewElement(checkRooms,api1.getRooms()[j]);
                }

            }
            System.out.println(Arrays.toString(checkRooms));
        }

        return checkRooms;
    }
}
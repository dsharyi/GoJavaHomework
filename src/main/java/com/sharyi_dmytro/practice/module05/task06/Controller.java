package com.sharyi_dmytro.practice.module05.task06;

import com.sharyi_dmytro.practice.module05.task01_02.Room;
import com.sharyi_dmytro.practice.module05.task03.API;
import com.sharyi_dmytro.practice.module05.task04.BookingComAPI;
import com.sharyi_dmytro.practice.module05.task04.GoogleAPI;
import com.sharyi_dmytro.practice.module05.task04.TripAdvisorAPI;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

import static com.sharyi_dmytro.practice.module05.task05.RoomDAOUse.addNewElement;


public class Controller {
    private API apis[] = new API[3];

    {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }


    public Room[] requestRooms(int price, int persons, String city, String hotel) {

        Room[] bookingComAPIRequestRooms = new Room[0];
        Room[] googleAPIRequestRooms = new Room[0];
        Room[] tripAdvisorAPIRequestRooms = new Room[0];
        Room[] allRequestRooms = new Room[0];


        for (int i = 0; i < apis.length; i++) {
            switch (i) {
                case 0:
                    bookingComAPIRequestRooms = apis[0].findRooms(price, persons, city, hotel);
                    allRequestRooms = ArrayUtils.addAll(allRequestRooms,bookingComAPIRequestRooms);
                    System.out.println("BookingComAPI find such rooms: " + Arrays.toString(bookingComAPIRequestRooms));
                    break;

                case 1:
                    googleAPIRequestRooms = apis[1].findRooms(price, persons, city, hotel);
                    allRequestRooms = ArrayUtils.addAll(allRequestRooms,googleAPIRequestRooms);
                    System.out.println("GoogleAPI find such rooms: " + Arrays.toString(googleAPIRequestRooms));
                    break;

                case 2:
                    tripAdvisorAPIRequestRooms = apis[2].findRooms(price, persons, city, hotel);
                    allRequestRooms = ArrayUtils.addAll(allRequestRooms,tripAdvisorAPIRequestRooms);
                    System.out.println("TripAdvisorAPI find such rooms: " + Arrays.toString(tripAdvisorAPIRequestRooms));
                    break;

            }


        }


        System.out.println("All arrays = " + Arrays.toString(allRequestRooms));
        return allRequestRooms;
    }



    public Room[] check(API api1, API api2) {
        Room[] checkRooms = new Room[0];
        int count=0;
        for (int i = 0; i < api1.getRooms().length; i++) {
            for (int j = 0; j < api2.getRooms().length; j++) {
                if (api1.getRooms()[i].equals(api2.getRooms()[j])) {
                    checkRooms= addNewElement(checkRooms, api1.getRooms()[i]);
                    count++;
                }

            }
        }
        //System.out.println(Arrays.toString(api1.getRooms()));
        //System.out.println(Arrays.toString(api2.getRooms()));

        System.out.println("The same rooms: "+Arrays.toString(checkRooms)+"Count of the same rooms= "+count);


        return checkRooms;
    }

}
package com.sharyi_dmytro.practice.module05.task06;

import com.sharyi_dmytro.practice.module05.task01_02.Room;
import com.sharyi_dmytro.practice.module05.task03.API;
import com.sharyi_dmytro.practice.module05.task04.BookingComAPI;
import com.sharyi_dmytro.practice.module05.task04.GoogleAPI;
import com.sharyi_dmytro.practice.module05.task04.TripAdvisorAPI;

import java.util.Arrays;


public class Controller {
    private API apis[] = new API[3];

    {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        Room[] allRequestRooms = new Room[apis.length];
        int count = 0;
        for (int i = 0; i < apis.length; i++) {
            for (int j = 0; j < apis[i].findRooms(price, persons, city, hotel).length; j++) {
                if (apis[i].findRooms(price, persons, city, hotel)[j] != null) {
                    allRequestRooms[count] = apis[i].findRooms(price, persons, city, hotel)[j];
                    System.out.println(allRequestRooms[count]);
                    count++;
                }
            }
        }

        return allRequestRooms;
    }


        public Room[] check (API api1, API api2){
            Room[] checkRooms = new Room[apis.length];
            int count = 0;
            for (int i = 0; i < api1.getRooms().length; i++) {
                for (int j = 0; j < api2.getRooms().length; j++) {
                    if (api1.getRooms()[i].equals(api2.getRooms()[j])){
                        checkRooms [count] = api1.getRooms()[i];
                        checkRooms [ count+1] = api2.getRooms()[j];
                    }

                }
                System.out.println(Arrays.toString(checkRooms));
            }

            return checkRooms;
        }
    }
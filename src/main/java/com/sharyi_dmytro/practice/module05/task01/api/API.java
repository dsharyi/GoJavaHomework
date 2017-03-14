package com.sharyi_dmytro.practice.module05.task01.api;

import com.sharyi_dmytro.practice.module05.task01.Room;

public interface API{
    Room[] findRooms(int price, int persons, String city, String hotel);
}

package com.sharyi_dmytro.practice.module05.task03;

import com.sharyi_dmytro.practice.module05.task01_02.Room;

public interface API{
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getRooms();
}

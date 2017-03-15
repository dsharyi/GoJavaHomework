package com.sharyi_dmytro.practice.module05.task05;


import com.sharyi_dmytro.practice.module05.task01_02.Room;

public interface RoomDAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);

}

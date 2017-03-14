package com.sharyi_dmytro.practice.module05.task01.dao;


import com.sharyi_dmytro.practice.module05.task01.Room;

public interface RoomDAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
    Room[] getAll();

}

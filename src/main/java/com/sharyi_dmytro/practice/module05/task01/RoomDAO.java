package com.sharyi_dmytro.practice.module05.task01;


public interface RoomDAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);

}

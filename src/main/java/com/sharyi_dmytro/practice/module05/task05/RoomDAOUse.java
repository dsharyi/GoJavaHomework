package com.sharyi_dmytro.practice.module05.task05;


import com.sharyi_dmytro.practice.module05.task01_02.Room;

import java.util.Arrays;
import java.util.Date;

public class RoomDAOUse implements RoomDAO {
    private Room[] roomDB = new Room[10];


    public Room save(Room room) {

        int count = getRoomsCount(roomDB);

        roomDB[count] = room;
        System.out.println("Была сохранена комната " + room);

        return room;
    }

    private int getRoomsCount(Room[] roomDB) {

        int count = 0;

        for (Room room : roomDB) {
            if (room != null) {
                count++;
            }
        }

        return count;
    }

    public static Room[] addNewElement(Room[] roomDB, Room newRoom) {
        Room[] newRoomDB = Arrays.copyOf(roomDB, roomDB.length+1);
        newRoomDB [newRoomDB.length-1] = newRoom;
        return newRoomDB;
    }


    public boolean delete(Room room) {
        for (int i = 0; i < roomDB.length; i++) {
            Room roomInDb = roomDB[i];

            if (room.equals(roomInDb)) {

                System.arraycopy(roomDB, i + 1, roomDB, i, roomDB.length - i - 1);

                roomDB[roomDB.length - 1] = null;
            }
        }
        System.out.println("Была удалена комната " + room);
        return true;

    }


    public Room update(Room room) {
        room.setPrice(room.getPrice() + 500);
        room.setDateAvailableFrom(new Date());
        System.out.println("Параметры комнаты изменены.Новая цена = " + room.getPrice() + " Доступна с " + room.getDateAvailableFrom());

        return room;
    }

    public Room findById(long id) {
        for (Room room : roomDB) {
            if (room != null && room.getId() == id) {
                System.out.println("Комната,которую Вы искали по id=" + id + ":" + room);
                return room;

            }
        }


        return null;
    }
}



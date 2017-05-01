package com.sharyi_dmytro.practice.module10.task03;


import com.sharyi_dmytro.practice.module07.task01.User;

public class UseNullPointerExc {
    public static void main(String[] args) {
        User user =null;

        try {
            user.getCity();
        }catch (NullPointerException e){
            System.out.println("Ссылка на null");
        }
    }
}

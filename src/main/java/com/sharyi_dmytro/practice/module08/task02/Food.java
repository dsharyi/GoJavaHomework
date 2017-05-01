package com.sharyi_dmytro.practice.module08.task02;

import com.sharyi_dmytro.practice.module08.task01.Country;
import com.sharyi_dmytro.practice.module08.task01.IdGenerator;

import java.util.Random;

/**
 * Created by nonal on 17.04.2017.
 */
public class Food{

    private final int id;
    private String name;
    private Country country;
    private int expiration;


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        return id == food.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    public Food(String name, Country country, int expiration) {
        id = IdGenerator.idGenerator(name,country,expiration);
        this.name = name;
        this.country = country;
        this.expiration = expiration;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Country=" + country +
                ", expiration=" + expiration +
                '}';
    }

}

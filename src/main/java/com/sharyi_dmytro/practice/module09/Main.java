package com.sharyi_dmytro.practice.module09;

import com.sharyi_dmytro.practice.module07.task01.User;
import com.sharyi_dmytro.practice.module07.task02.Order;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static com.sharyi_dmytro.practice.module09.UseSortJava8.*;


public class Main {
    public static void main(String[] args) {


        List<User> userList = new ArrayList<>(10);
        List<Order> orderList = new ArrayList<>(10);

        userList.add(new User(1, "Alexandera", "Voi", "Berlin", 30500));
        userList.add(new User(2, "Alexander", "Moo", "Berlin", 3000));
        userList.add(new User(3, "Joe", "Foster", "London", 1000));
        userList.add(new User(4, "Michel", "Woods", "Cardiff", 4000));
        userList.add(new User(5, "Ostap", "Petrov", "Dnipro", 10000));
        userList.add(new User(6, "Ben", "Crouch", "Warsaw", 2000));
        userList.add(new User(7, "Meg", "Split", "Lviv", 3500));
        userList.add(new User(8, "Alex", "Petrov", "Lviv", 4300));
        userList.add(new User(9, "Dmytro", "Petrov", "Kyiv", 20000));
        userList.add(new User(10, "Artem", "Sharyi", "Dnipro", 250000));

        orderList.add(new Order(2, 3200, Order.Currency.USD, "Comp", "Mag", userList.get(1)));
        orderList.add(new Order(2, 3200, Order.Currency.USD, "Comp", "Mag", userList.get(1)));
        orderList.add(new Order(3, 7300, Order.Currency.UAH, "Monitor", "Shp", userList.get(2)));
        orderList.add(new Order(4, 5400, Order.Currency.USD, "Mobile", "Roz", userList.get(3)));
        orderList.add(new Order(5, 500, Order.Currency.UAH, "Notebook", "Mag", userList.get(4)));
        orderList.add(new Order(6, 2600, Order.Currency.USD, "Table", "Roz", userList.get(5)));
        orderList.add(new Order(7, 1700, Order.Currency.UAH, "Mouse", "Mag", userList.get(6)));
        orderList.add(new Order(8, 1000, Order.Currency.UAH, "Ball", "Roz", userList.get(7)));
        orderList.add(new Order(9, 1000, Order.Currency.UAH, "Ball", "Roz", userList.get(8)));
        orderList.add(new Order(10, 1000, Order.Currency.UAH, "Ball", "Roz", userList.get(9)));

        sortPriceReverse(orderList);
        sortPriceAndCity(orderList);
        sortItemIDAndCity(orderList);
        removeDuplicate(orderList);
        removeOrdersWherePriceLess1500(orderList);
        twoListCurrencies(orderList);
        listsWithUniqueCities(orderList);
        checkName(orderList);
        removeOrdersUSD(orderList);

    }






}



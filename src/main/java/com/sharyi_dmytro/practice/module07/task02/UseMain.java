package com.sharyi_dmytro.practice.module07.task02;


import com.sharyi_dmytro.practice.module07.task01.User;

import java.util.*;

public class UseMain {


    public static void main(String[] args) {
        User[] users = new User[10];
        users[0] = new User(1, "Alex", "Cole", "London", 2000);
        users[1] = new User(2, "Alexander", "Moo", "Berlin", 3000);
        users[2] = new User(3, "Joe", "Foster", "London", 1000);
        users[3] = new User(4, "Michel", "Woods", "Cardiff", 4000);
        users[4] = new User(5, "Ostap", "Bender", "Dnipro", 10000);
        users[5] = new User(6, "Ben", "Crouch", "Warsaw", 2000);
        users[6] = new User(7, "Meg", "Split", "Lviv", 3500);
        users[7] = new User(8, "Alex", "Wonder", "Lviv", 4300);
        users[8] = new User(9, "Dmytro", "Sharyi", "Kyiv", 20000);
        users[9] = new User(10, "Artem", "Sharyi", "Dnipro", 250000);

        Order[] orders = new Order[10];
        orders[0] = new Order(1, 1100, Order.Currency.UAH, "Ball", "Roz", users[0]);
        orders[1] = new Order(2, 3200, Order.Currency.USD, "Comp", "Mag", users[1]);
        orders[2] = new Order(3, 7300, Order.Currency.UAH, "Monitor", "Shp", users[2]);
        orders[3] = new Order(4, 5400, Order.Currency.USD, "Mobile", "Roz", users[3]);
        orders[4] = new Order(5, 500, Order.Currency.UAH, "Notebook", "Mag", users[4]);
        orders[5] = new Order(6, 2600, Order.Currency.USD, "Table", "Roz", users[5]);
        orders[6] = new Order(7, 1700, Order.Currency.UAH, "Mouse", "Mag", users[6]);
        orders[7] = new Order(10, 1000, Order.Currency.UAH, "Ball", "Roz", users[9]);
        orders[8] = new Order(10, 1000, Order.Currency.UAH, "Ball", "Roz", users[9]);
        orders[9] = new Order(10, 1000, Order.Currency.UAH, "Ball", "Roz", users[9]);






        List<User> userList = new ArrayList<>(Arrays.asList(users));
        List<Order> orderList = new ArrayList<>(Arrays.asList(orders));
        //Set<Order> setOrders = new HashSet<>(Arrays.asList(orders));
        //System.out.println("Set = "+setOrders.toString()+"size = "+setOrders.size());
        UseSort.sortPriceDecrease(orderList);
        System.out.println("Сортировка товаров по спаданию цены: "+orderList.toString());
        UseSort.sortPriceAndCityIncrease(orderList);
        System.out.println("Сортировка товаров по возрастанию по цене и городу: "+orderList.toString());
        UseSort.sortItemNameIdOrderAndCity(orderList);
        System.out.println("Сортировка товаров по названию товара, ID и городу: "+orderList.toString());
        System.out.println("Список после удаления дубликатов: "+ OperationsWithList.removeDuplicate(orderList));
        OperationsWithList.removePriceLess1500(orderList);
        System.out.println("Список заказов с ценой меньше 1500: "+ orderList.toString());
        OperationsWithList.listsWith2Currencies(orderList);
        //System.out.println("Список с уникальными городами: "+OperationsWithList.listsWithUniqueCities(userList));







    }


}

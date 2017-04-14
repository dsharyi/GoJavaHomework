package com.sharyi_dmytro.practice.module07.task03;


import com.sharyi_dmytro.practice.module07.task01.User;
import com.sharyi_dmytro.practice.module07.task02.Order;
import com.sharyi_dmytro.practice.module07.task02.Order.Currency;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[10];
        users[0] = new User(1, "Alex", "Petrov", "London", 2000);
        users[1] = new User(2, "Alexander", "Moo", "Berlin", 3000);
        users[2] = new User(3, "Joe", "Foster", "London", 1000);
        users[3] = new User(4, "Michel", "Woods", "Cardiff", 4000);
        users[4] = new User(5, "Ostap", "Bender", "Dnipro", 10000);
        users[5] = new User(6, "Ben", "Petro", "Warsaw", 2000);
        users[6] = new User(7, "Meg", "Split", "Lviv", 3500);
        users[7] = new User(8, "Alex", "Wonder", "Lviv", 4300);
        users[8] = new User(9, "Dmytro", "Sharyi", "Kyiv", 20000);
        users[9] = new User(10, "Artem", "Sharyi", "Dnipro", 250000);

        Order[] orders = new Order[10];
        orders[0] = new Order(1, 1100, Currency.UAH, "Ball", "Roz", users[0]);
        orders[1] = new Order(2, 3200, Currency.USD, "Comp", "Mag", users[1]);
        orders[2] = new Order(3, 7300, Currency.UAH, "Monitor", "Shp", users[2]);
        orders[3] = new Order(4, 5400, Currency.USD, "Mobile", "Roz", users[3]);
        orders[4] = new Order(5, 500, Currency.UAH, "Notebook", "Mag", users[4]);
        orders[5] = new Order(6, 2600, Currency.USD, "Table", "Roz", users[5]);
        orders[6] = new Order(7, 1700, Currency.UAH, "Mouse", "Mag", users[6]);
        orders[7] = new Order(8, 1200, Currency.UAH, "Ball", "Roz", users[7]);
        orders[8] = new Order(10, 1000, Currency.UAH, "Ball", "Roz", users[9]);
        orders[9] = new Order(10, 1000, Currency.UAH, "Ball", "Roz", users[9]);


        //List<User> userList = new ArrayList<>(Arrays.asList(users));
        //List<Order> orderList = new ArrayList<>(Arrays.asList(orders));
        TreeSet<Order> setOrder = new TreeSet<>(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        });
        setOrder.add(new Order(1, 1100, Currency.UAH, "Ball", "Roz", users[0]));
        setOrder.add(new Order(1, 1100, Currency.UAH, "Ball", "Roz", users[0]));
        setOrder.add(new Order(3, 7300, Currency.UAH, "Monitor", "Shp", users[2]));
        setOrder.add(new Order(4, 5400, Currency.USD, "Mobile", "Roz", users[3]));
        setOrder.add(new Order(5, 500, Currency.UAH, "Notebook", "Mag", users[4]));
        setOrder.add(new Order(6, 2600, Currency.USD, "Table", "Roz", users[5]));
        setOrder.add(new Order(7, 1700, Currency.UAH, "Mouse", "Mag", users[6]));
        setOrder.add(new Order(8, 1200, Currency.UAH, "Ball", "Roz", users[7]));
        setOrder.add(new Order(9, 22200, Currency.UAH, "Pen", "Olx", users[8]));
        setOrder.add(new Order(10, 1000, Currency.UAH, "Ball", "Roz", users[9]));


        //for (Order o : setOrder) {
        //    System.out.println(o);
//
        //}

        Iterator<Order> it = setOrder.iterator();
        int count = 0;
        while (it.hasNext()) {
            Order next = it.next();
            if (next.getUser().getLastName().equals("Petrov")) {
                System.out.println("Заказ с фамилией Petrov - " + next);
                count++;
            }


        }
        if (count == 0) {
            System.out.println("Заказов с фамилией Petrov нету");

        }

        System.out.println(setOrder.first());

        Iterator<Order> iterator = setOrder.iterator();
        while (iterator.hasNext()) {
            Order next = iterator.next();
            if (next.getCurrency().equals(Currency.USD)) {
                iterator.remove();
            }


        }


        for (Order o : setOrder) {
            System.out.println(o);

        }


    }
}

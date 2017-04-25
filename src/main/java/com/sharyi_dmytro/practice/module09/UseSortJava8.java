package com.sharyi_dmytro.practice.module09;

import com.sharyi_dmytro.practice.module07.task01.User;
import com.sharyi_dmytro.practice.module07.task02.Order;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;


public class UseSortJava8 {
    public static void sortPriceReverse(List<Order> list) {
        System.out.println("Сортировка заказов по цене по убыванию: ");
        list.sort(Comparator.comparing(Order::getPrice).reversed());
        System.out.println(list);

    }

    public static void sortPriceAndCity(List<Order> list) {
        System.out.println("Сортировка заказов по цене по возрастанию и по городу: ");
        list.stream().sorted((o1, o2) -> o1.getUser().getCity().compareTo(o2.getUser().getCity())).
                sorted((o1, o2) -> Integer.valueOf(o1.getPrice()).compareTo(o2.getPrice())).
                collect(Collectors.toCollection(ArrayList<Order>::new)).forEach(System.out::println);


    }

    public static void sortItemIDAndCity(List<Order> list) {
        System.out.println("Сортировка заказов по названию товара, ID и городу пользователя: ");
        list.stream().sorted(Comparator.comparing(o -> o.getUser().getCity())).
                sorted(Comparator.comparing(Order::getItemName).thenComparing(Order::getId))
                .collect(Collectors.toCollection(ArrayList::new)).forEach(System.out::println);
    }

    public static void removeDuplicate(List<Order> list) {
        System.out.println("Вывод на экран уникальных заказов: ");
        list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

    }

    public static void removeOrdersWherePriceLess1500(List<Order> list) {
        System.out.println("Вывод на экран заказов с ценой больше 1500: ");
        list.stream().filter(order -> order.getPrice() > 1500).collect(Collectors.toList()).forEach(System.out::println);
    }

    public static void twoListCurrencies(List<Order> list) {
        System.out.println("Вывод на экран двух списков с разными валютами: ");
        System.out.println("Вывод на экран списка в гривне: ");
        list.stream().filter(order -> order.getCurrency().equals(Order.Currency.UAH)).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Вывод на экран списка в долларах: ");
        list.stream().filter(order -> order.getCurrency().equals(Order.Currency.USD)).collect(Collectors.toList()).forEach(System.out::println);
    }

    public static void listsWithUniqueCities(List<Order> list) {
        System.out.println("Вывод на экран списков с уникальными городами: ");
        HashSet<String> uniqueCities = list.stream().map(order -> order.getUser().getCity()).collect(Collectors.toCollection(HashSet::new));
        for (String city : uniqueCities) {
            System.out.println("Лист для " + city + " ");
            list.stream().filter(order -> order.getUser().getCity().equals(uniqueCities)).collect(Collectors.toList()).forEach(System.out::println);
        }

    }

    public static void checkName(List<Order> list) {
        System.out.println("Вывод на экран заказа с фамилией Petrov: ");
        list.stream().filter(order -> order.getUser().getLastName().equals("Petrov")).collect(Collectors.toList()).forEach(System.out::println);

    }

    public static void removeOrdersUSD(List<Order> list) {
        System.out.println("Вывод на экран заказов не в долларовой валюте: ");
        list.stream().filter(order -> order.getCurrency() != Order.Currency.USD).collect(Collectors.toList()).forEach(System.out::println);
    }
}
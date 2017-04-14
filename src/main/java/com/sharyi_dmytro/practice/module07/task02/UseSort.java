package com.sharyi_dmytro.practice.module07.task02;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class UseSort {
    public static void sortPriceDecrease(List list) {
        Collections.sort(list, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }

        });
    }

    public static void sortPriceAndCityIncrease(List list) {

        Collections.sort(list, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getPrice() == o2.getPrice()) {
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }
                return o1.getPrice() - o2.getPrice();
            }

        });
    }

    public static void sortItemNameIdOrderAndCity(List list) {

        Collections.sort(list, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getItemName().equals(o2.getItemName())) {
                    return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                } else if ((o1.getItemName().equals(o2.getItemName())) && (o1.getShopIdentificator().equals(o2.getShopIdentificator()))) {
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }
                return o1.getItemName().compareTo(o2.getItemName());

            }
        });

    }
}

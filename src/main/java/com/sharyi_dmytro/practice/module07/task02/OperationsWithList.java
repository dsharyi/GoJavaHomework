package com.sharyi_dmytro.practice.module07.task02;

import com.sharyi_dmytro.practice.module07.task01.User;

import java.util.*;

import static com.sharyi_dmytro.practice.module07.task02.Order.Currency.UAH;
import static com.sharyi_dmytro.practice.module07.task02.Order.Currency.USD;


public class OperationsWithList {

    public static Set removeDuplicate(List<Order> list) {
        return new HashSet<Order>(list);

    }

    public static List removePriceLess1500(List<Order> list) {
        Iterator<Order> it = list.iterator();
        while (it.hasNext()) {
            Order next = it.next();
            if (next.getPrice() < 1500) {
                it.remove();
            }


        }

        return list;
    }

    public static List<List<Order>> listsWith2Currencies(List<Order> list) {
        List<Order> listUSD = new ArrayList<>();
        List<Order> listUAH = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {


            if (list.get(i).getCurrency() == UAH) {

                listUAH.add(list.get(i));

            } else if (list.get(i).getCurrency() == USD) {

                listUSD.add(list.get(i));


            }

        }
        System.out.println("UAH = " + listUAH.toString());
        System.out.println("USD = " + listUSD.toString());
        return null;
    }


    //ublic static List<List<User>> listsWithUniqueCities(List<User> list) {
    //   List<List<User>> listUsers = new ArrayList<>();
    //   List<User> listSameCities = new ArrayList<>();
    //   for (int i = 0; i <list.size() ; i++) {
    //       for (int j = 0; j <list.size() ; j++) {
    //       if (list.get(i).equals(list.get(j))){
    //           listSameCities.add(list.get(j));
    //       }

    //   }


    //   HashSet<User> usersWithUniqueCities = new HashSet<>(list);
    //   //for (int i = 0; i < usersWithUniqueCities.size(); i++) {
    //   //    listUsers.add(new ArrayList<User>(usersWithUniqueCities));
//
    //   //}

    //   return listUsers;

    //}

}


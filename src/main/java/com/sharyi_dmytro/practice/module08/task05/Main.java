package com.sharyi_dmytro.practice.module08.task05;

import com.sharyi_dmytro.practice.module08.task01.Country;
import com.sharyi_dmytro.practice.module08.task02.Food;
import com.sharyi_dmytro.practice.module08.task04.UseIManageSystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Food potato = new Food("Potato", Country.UKRAINE, 150);
        Food wine = new Food("Wine", Country.FRANCE, 20000);
        Food beer = new Food("Beer", Country.GERMANY, 100);
        Food sake = new Food("Sake", Country.JAPAN, 360);
        Food whiskey = new Food("Whiskey", Country.USA, 540);

        UseIManageSystem manageSystem = new UseIManageSystem();

        manageSystem.save(potato, 10);
        manageSystem.save(wine, 3000);
        manageSystem.save(beer, 30);
        manageSystem.save(sake, 140);

        System.out.println("Цена пива= " + manageSystem.getPrice(beer));
        System.out.println("Цены на все продукты= " + manageSystem.getPrices());

        manageSystem.save(whiskey, 320);
        System.out.println("Цена виски= " + manageSystem.getPrice(whiskey));

        Set products = manageSystem.getProducts();
        System.out.println("Информация о продуктах:");
        for (Object product : products
                ) {
            System.out.println(product);

        }

        List<Double> prices = manageSystem.getPrices();
        System.out.println("Информация о ценах на продукты:");
        for (Double price : prices
                ) {
            System.out.println(price);

        }
        System.out.println("Вывод продуктов по ID");
        System.out.println(manageSystem.get(beer.getId()));

        System.out.println("Удаление продуктов по ID...");
        manageSystem.deleteById(whiskey.getId());
        System.out.println("Удаление продуктов по обьекту...");
        manageSystem.delete(wine);

        System.out.println("Продукты после удаления: ");
        Set productsAfterDelete = manageSystem.getProducts();

        for (Object o : productsAfterDelete
                ) {
            System.out.println(o);

        }

        manageSystem.printProductsSortedByName();
        manageSystem.printProductsSortedByPrice();


    }


}


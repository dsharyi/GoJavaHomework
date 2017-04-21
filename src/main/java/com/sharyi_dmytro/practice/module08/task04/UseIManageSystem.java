package com.sharyi_dmytro.practice.module08.task04;

import com.sharyi_dmytro.practice.module08.task02.Food;
import com.sharyi_dmytro.practice.module08.task03.IManageSystem;

import java.util.*;


public final class UseIManageSystem implements IManageSystem<Food> {
    private Map<Food, Double> database = new HashMap<>();


    public Food save(Food food, double price) {
        database.put(food, price);
        return food;
    }

    public Food save(Food food) {
        if (database.containsKey(food)) {
            return food;
        } else database.put(food, 0.0);
        return food;
    }


    public void delete(Food food) {
        database.remove(food);

    }

    public void deleteById(int id) {
        Set<Food> setKeys = database.keySet();
        Iterator<Food> it = setKeys.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
            }

        }

    }

    public Food get(int id) {
        Set<Food> setKeys = database.keySet();
        for (Food food : setKeys) {
            if (food.getId() == id) {
                return food;

            }

        }
        return null;
    }

    public Double getPrice(Food food) {
        return database.get(food);
    }


    public Set getProducts() {
        Set<Food> products = new HashSet<>(database.keySet());
        return products;
    }

    public List<Double> getPrices() {
        return new ArrayList<>(database.values());
    }


    public void printProductsSortedByName() {
        Map<Food, Double> sortedMap = new TreeMap<Food, Double>(new Comparator<Food>() {
            public int compare(Food o1, Food o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        sortedMap.putAll(database);
        System.out.println("Сортировка по имени: ");
        for (Map.Entry<Food, Double> foodDoubleEntry : sortedMap.entrySet()) {
            System.out.println(foodDoubleEntry);
        }
    }


    public void printProductsSortedByPrice() {
        System.out.println("Сортировка по цене: ");
        List<Map.Entry<Food, Double>> list =
                new LinkedList<Map.Entry<Food, Double>>(database.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Food, Double>>() {
            public int compare(Map.Entry<Food, Double> o1,
                               Map.Entry<Food, Double> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        Map<Food, Double> sortedMap = new LinkedHashMap<Food, Double>();
        for (Map.Entry<Food, Double> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        for (Object o : list
                ) {
            System.out.println(o);

        }


    }


    public String printDataBase() {
        for (Map.Entry<Food, Double> food : database.entrySet()
                ) {
            System.out.println(food);

        }
        return null;


    }
}


package com.sharyi_dmytro.practice.module04.task01;


public class Main {
    public static void main(String[] args) {


        User userUSbank1 = new User(1, "Alex", 25000, 12, "Google", 3000, new USBank(1, "USA", Currency.USD, 250, 1800, 5, 200_000_000));
        User userUSbank2 = new User(2, "Nick", 12000, 8, "Amazon", 2000, new USBank(2, "USA", Currency.USD, 350, 2500, 4, 100_000_000));
        User userEUbank1 = new User(3, "Oliver", 6000, 36, "KFC", 1000, new EUBank(3, "Greece", Currency.EUR, 100, 900, 2, 80_000_000));
        User userEUbank2 = new User(4, "Mary", 18000, 24, "Zara", 3500, new EUBank(4, "Germany", Currency.EUR, 300, 2900, 3, 150_000_000));
        User userChinabank1 = new User(5, "Lee", 2000, 56, "D&G", 2000, new ChinaBank(5, "China", Currency.USD, 450, 1000, 1, 120_000_000));
        User userChinabank2 = new User(6, "Xiao", 20000, 48, "Apple", 4000, new ChinaBank(6, "China", Currency.USD, 350, 1800, 4, 320_000_000));
        BankSystemImpl bankSystem = new BankSystemImpl();

        bankSystem.withdrawOfUser(userEUbank1, 200);
        bankSystem.fundUser(userEUbank1, 1200);
        bankSystem.transferMoney(userEUbank1, userEUbank2, 200);
        bankSystem.paySalary(userEUbank1);

        bankSystem.withdrawOfUser(userEUbank2, 200);
        bankSystem.fundUser(userEUbank2, 500);
        bankSystem.paySalary(userEUbank2);

        bankSystem.withdrawOfUser(userUSbank1, 1000);
        bankSystem.fundUser(userUSbank1, 1200);
        bankSystem.transferMoney(userUSbank1, userUSbank2, 2200);
        bankSystem.paySalary(userUSbank1);

        bankSystem.withdrawOfUser(userUSbank2, 1200);
        bankSystem.fundUser(userUSbank2, 5000);
        bankSystem.paySalary(userUSbank2);

        bankSystem.withdrawOfUser(userChinabank1, 3200);
        bankSystem.fundUser(userChinabank1, 4000);
        bankSystem.transferMoney(userChinabank1, userChinabank2, 800);
        bankSystem.paySalary(userChinabank1);

        bankSystem.withdrawOfUser(userChinabank2, 300);
        bankSystem.fundUser(userChinabank2, 4500);
        bankSystem.paySalary(userChinabank2);

        System.out.println(userChinabank1);
        System.out.println(userChinabank2);
        System.out.println(userEUbank1);
        System.out.println(userEUbank2);
        System.out.println(userUSbank1);
        System.out.println(userUSbank2);


    }

}

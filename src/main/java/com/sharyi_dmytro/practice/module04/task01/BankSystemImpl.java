package com.sharyi_dmytro.practice.module04.task01;


public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        if (user.getBank().getLimitOfWithdrawal() >= amount){


            user.setBalance(user.getBalance() - amount- user.getBank().getCommission(amount));


            System.out.println("Клиент снял " + amount + " Комиссия составляет: "+ user.getBank().getCommission(amount)+ " Остаток на счету = " + user.getBalance());


        } else {
            System.out.println("Операция невозможна!");
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        if (user.getBank().getLimitOfFunding() >= amount) {


            user.setBalance(user.getBalance() + amount);
            System.out.println("Пользователь пополнил счет на " + amount + " Баланс после пополнения =" + user.getBalance());


        } else {
            System.out.println("Операция невозможна!");
        }


    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser.getBalance() > amount) {

            fromUser.setBalance(fromUser.getBalance() - amount);
            toUser.setBalance(toUser.getBalance() + amount);
            System.out.println("Баланс клиента-отправителя = " + fromUser.getBalance() + " Баланс клиента-получателя = " + toUser.getBalance() + " Суммма перевода составила = " + amount);
        } else {
            System.out.println("Операция невозможна!");
        }
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
        System.out.println("Баланс после зачисления месячной зарплаты = " + user.getBalance());

    }
}

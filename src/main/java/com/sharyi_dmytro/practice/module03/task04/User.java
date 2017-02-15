package com.sharyi_dmytro.practice.module03.task04;

public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;
    private static final double PERCENT_OF_COMMISION1 = 0.05;
    private static final double PERCENT_OF_COMMISION2 = 0.1;

    public static void main(String[] args) {
        User user = new User("Dima", 0, 11, "Luxoft", 0, "USD");
        user.paySalary();
        user.withdraw(200);
        user.companyNameLenght();
        user.monthIncreaser(2);

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {

        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public void paySalary() {
        balance = salary + balance;
        System.out.println("Сумма баланса после зачисления заработной платы = " + balance);

    }

    public void withdraw(int summ) {

        if (balance <= 0) {
            System.out.println("Снятие денег запрещено.Недостаточно средств на счету!");
        } else if (summ < 1000) {
            balance = (int) (balance - (summ + (summ * PERCENT_OF_COMMISION1)));
        } else {
            balance = (int) (balance - (summ + (summ * PERCENT_OF_COMMISION2)));
        }
        System.out.println("Сумма баланса после снятия денег = " + balance);


    }

    public void companyNameLenght() {
        int lengthOfNameCompany = companyName.length();
        System.out.println("Длина имени компании = " + lengthOfNameCompany);

    }

    public void monthIncreaser(int addMonth) {
        monthsOfEmployment = monthsOfEmployment + addMonth;
        System.out.println("Количество месяцев рабочей занятости после прибавления нескольких месяцев = " + monthsOfEmployment);
    }
}

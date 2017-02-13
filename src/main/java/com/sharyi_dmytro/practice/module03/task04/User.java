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
        User user = new User("Dima",1500,11,"Luxoft",1000,"USD");
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

    void paySalary() {
        int balancePlusSalary = salary + balance;
        System.out.println("Сумма баланса и заработной платы = " + balancePlusSalary);

    }

    void withdraw(int summ) {
        double withdraw;
        if (summ < 1000) {
            withdraw = summ + summ * PERCENT_OF_COMMISION1;
        } else {
            withdraw = summ + summ * PERCENT_OF_COMMISION2;
        }
        System.out.println("Количество снятых денег = " + withdraw);
    }

    void companyNameLenght() {
        int lengthOfNameCompany = companyName.length();
        System.out.println("Длина имени компании = " + lengthOfNameCompany);

    }
    void monthIncreaser(int addMonth){
        int monthIncreaser = monthsOfEmployment+addMonth;
        System.out.println("Количество месяцев рабочей занятости = "+monthIncreaser);
    }
}

package com.sharyi_dmytro.practice.module04.task01;


public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;
        if (getCurrency().equals(Currency.USD)) {

            limitOfWithdrawal = 2000;
        } else if (getCurrency().equals(Currency.EUR)) {
            limitOfWithdrawal = 2200;
        }
        return limitOfWithdrawal;

    }

    @Override
    public int getLimitOfFunding() {
        int limitOfFunding = 0;
        if (getCurrency().equals(Currency.USD)) {

            limitOfFunding = 10000;
        } else if (getCurrency().equals(Currency.EUR)) {
            limitOfFunding = 20000;
        }
        return limitOfFunding;

    }

    @Override
    public int getMonthlyRate() {
        int monthlyRate = 0;
        if (getCurrency().equals(Currency.USD)) {

            monthlyRate = 0;
        } else if (getCurrency().equals(Currency.EUR)) {
            monthlyRate = 1;
        }
        return monthlyRate;

    }

    @Override
    public int getCommission(int summ) {
        int commision = 0;
        if (getCurrency().equals(Currency.USD) && summ < 1000) {

            commision = 5;
        }
        if (getCurrency().equals(Currency.USD) && summ > 1000) {

            commision = 7;
        }

        if (getCurrency().equals(Currency.EUR) && summ < 1000) {
            commision = 2;
        } else if (getCurrency().equals(Currency.EUR) && summ > 1000) {
            commision = 4;
        }
        return commision;
    }
}

package com.sharyi_dmytro.practice.module04.task01;


public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public static final int LIMITOFWITHDRAWAL1 = 100;
    public static final int LIMITOFWITHDRAWAL2 = 150;
    public static final int MONTHLYRATE1 = 1;
    public static final int MONTHLYRATE2 = 0;
    public static final int LIMITOFFUNDING1 = 10000;
    public static final int LIMITOFFUNDING2 = 5000;
    public static final int COMMISION1 = 2;
    public static final int COMMISION2 = 3;
    public static final int COMMISION3 = 4;
    public static final int COMMISION4 = 5;


    public int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;
        if (getCurrency().equals(Currency.USD)) {

            limitOfWithdrawal = LIMITOFWITHDRAWAL1;
        } else if (getCurrency().equals(Currency.EUR)) {
            limitOfWithdrawal = LIMITOFWITHDRAWAL2;
        }
        return limitOfWithdrawal;

    }


    public int getLimitOfFunding() {
        int limitOfFunding = 0;
        if (getCurrency().equals(Currency.USD)) {

            limitOfFunding = LIMITOFFUNDING1;
        } else if (getCurrency().equals(Currency.EUR)) {
            limitOfFunding = LIMITOFFUNDING2;
        }
        return limitOfFunding;

    }


    public int getMonthlyRate() {
        int monthlyRate = 0;
        if (getCurrency().equals(Currency.USD)) {

            monthlyRate = MONTHLYRATE1;
        } else if (getCurrency().equals(Currency.EUR)) {
            monthlyRate = MONTHLYRATE2;
        }
        return monthlyRate;

    }


    public int getCommission(int summ) {
        int commision = 0;
        if (getCurrency().equals(Currency.USD) && summ < 1000) {

            commision = COMMISION2;
        }
        if (getCurrency().equals(Currency.USD) && summ > 1000) {

            commision = COMMISION4;
        }

        if (getCurrency().equals(Currency.EUR) && summ < 1000) {
            commision = COMMISION1;
        } else if (getCurrency().equals(Currency.EUR) && summ > 1000) {
            commision = COMMISION3;
        }
        return commision;
    }
}

package com.sharyi_dmytro.practice.module02.task2;


public class BankOperation {
    int balance = 100;
    int withdrawal = 10;
    //int withdrawal = 99;
    public static final double PERCENT_OF_COMMISION = 0.05;

    public static void main(String[] args) {
        BankOperation bankOperation = new BankOperation();
        bankOperation.conditionOfBalance();


    }

    public void conditionOfBalance() {
        double commision = withdrawal * PERCENT_OF_COMMISION;
        double balanceAfterWithdrawal = balance - withdrawal - commision;
        if (balanceAfterWithdrawal >= 0) {
            System.out.println("OK" + " Commision = " + commision + " Balance after withdrawal = " + balanceAfterWithdrawal);
        } else {
            System.out.println("NO");
        }


    }

}

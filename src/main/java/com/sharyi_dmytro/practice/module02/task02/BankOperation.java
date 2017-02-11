package com.sharyi_dmytro.practice.module02.task02;


public class BankOperation {

    public static final double PERCENT_OF_COMMISION = 0.05;

    public static void main(String[] args) {
        BankOperation bankOperation = new BankOperation();
        bankOperation.conditionOfBalance(100,10);


    }

    public void conditionOfBalance(int balance, int withdrawal) {
        double commision = withdrawal * PERCENT_OF_COMMISION;
        double balanceAfterWithdrawal = balance - withdrawal - commision;
        if (balanceAfterWithdrawal >= 0) {
            System.out.println("OK" + " Commision = " + commision + " Balance after withdrawal = " + balanceAfterWithdrawal);
        } else {
            System.out.println("NO");
        }


    }

}

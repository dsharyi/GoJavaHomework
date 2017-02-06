package com.sharyi_dmytro.practice.module02.task03;

public class ConditionOfParticularAccount {
    public static final double PERCENT_OF_COMMISION = 0.05;
    int[] balances = {1200, 250, 2000, 500, 3200};
    String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};


    public static void main(String[] args) {
        ConditionOfParticularAccount conditionOfParticularAccount = new ConditionOfParticularAccount();
        conditionOfParticularAccount.conditionOfBalance("Oww", 490);

    }


    public void conditionOfBalance(String ownerName, double withdrawal) {
        double commision = withdrawal * PERCENT_OF_COMMISION;
        if (ownerName == "Jane") {
            double balanceAfterWithdrawalJane = balances[0] - withdrawal - commision;
            if (balanceAfterWithdrawalJane >= 0) {
                System.out.println(ownerName + " Sum of withdrawal = " + withdrawal + " Balance after withdrawal = " + balanceAfterWithdrawalJane);
            } else {
                System.out.println(ownerName + " NO");
            }
        }
        if (ownerName == "Ann") {
            double balanceAfterWithdrawalAnn = balances[1] - withdrawal - commision;
            if (balanceAfterWithdrawalAnn >= 0) {
                System.out.println(ownerName + " Sum of withdrawal = " + withdrawal + " Balance after withdrawal = " + balanceAfterWithdrawalAnn);
            } else {
                System.out.println(ownerName + " NO");
            }
        }
        if (ownerName == "Jack") {
            double balanceAfterWithdrawalJack = balances[2] - withdrawal - commision;
            if (balanceAfterWithdrawalJack >= 0) {
                System.out.println(ownerName + " Sum of withdrawal = " + withdrawal + " Balance after withdrawal = " + balanceAfterWithdrawalJack);
            } else {
                System.out.println(ownerName + " NO");
            }
        }
        if (ownerName == "Oww") {
            double balanceAfterWithdrawalOww = balances[3] - withdrawal - commision;
            if (balanceAfterWithdrawalOww >= 0) {
                System.out.println(ownerName + " Sum of withdrawal = " + withdrawal + " Balance after withdrawal = " + balanceAfterWithdrawalOww);
            } else {
                System.out.println(ownerName + " NO");
            }
        }
        if (ownerName == "Lane") {
            double balanceAfterWithdrawalLane = balances[4] - withdrawal - commision;
            if (balanceAfterWithdrawalLane >= 0) {
                System.out.println(ownerName + " Sum of withdrawal = " + withdrawal + " Balance after withdrawal = " + balanceAfterWithdrawalLane);
            } else {
                System.out.println(ownerName + " NO");
            }

        }


    }
}


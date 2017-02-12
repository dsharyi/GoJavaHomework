package com.sharyi_dmytro.practice.module02.task03;

public class ConditionOfParticularAccount {
    public static final double PERCENT_OF_COMMISION = 0.05;
    private int[] balances;
    private String[] ownerNames;

    public ConditionOfParticularAccount(int[] balances, String[] ownerNames) {
        this.balances = balances;
        this.ownerNames = ownerNames;
    }

    public static void main(String[] args) {
        ConditionOfParticularAccount conditionOfParticularAccount = new ConditionOfParticularAccount(new int[]{1200, 250, 2000, 500, 3200}, new String[]{"Jane", "Ann", "Jack", "Oww", "Lane"});
        conditionOfParticularAccount.conditionOfBalance("Ann", 100);

    }


    public void conditionOfBalance(String ownerName, double withdrawal) {
        double commision = withdrawal * PERCENT_OF_COMMISION;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName.equals(ownerNames[i])) {
                double balanceAfterWithdrawalJane = balances[i] - withdrawal - commision;
                if (balanceAfterWithdrawalJane >= 0) {
                    System.out.println(ownerNames[i] + " Sum of withdrawal = " + withdrawal + " Balance after withdrawal = " + balanceAfterWithdrawalJane);
                } else {
                    System.out.println(ownerName + " NO");
                }
                break;
            }
        }
    }
}








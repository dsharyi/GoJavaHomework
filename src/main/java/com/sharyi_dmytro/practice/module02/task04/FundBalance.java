package com.sharyi_dmytro.practice.module02.task04;


public class FundBalance {
    private int[] balances;
    private String[] ownerNames;


    public static void main(String[] args) {

        FundBalance fundBalance = new FundBalance();
        fundBalance.setBalances(new int[]{1200, 250, 2000, 500, 3200});
        fundBalance.setOwnerNames(new String[]{"Jane", "Ann", "Jack", "Oww", "Lane"});
        fundBalance.FundingBalance("Jack", 100);

    }

    public void setBalances(int[] balances) {
        this.balances = balances;
    }

    public void setOwnerNames(String[] ownerNames) {
        this.ownerNames = ownerNames;
    }

    public int[] getBalances() {

        return balances;
    }

    public String[] getOwnerNames() {
        return ownerNames;
    }

    public void FundingBalance(String ownerName, double withdrawal) {
        for (int i = 0; i < getOwnerNames().length; i++) {
            if (ownerName.equals(getOwnerNames()[i])) {
                double balanceAfterFunding = getBalances()[i] + withdrawal;
                System.out.println(ownerName + " Balance after funding = " + balanceAfterFunding);
                break;

            }
        }
    }
}


package com.sharyi_dmytro.practice.module02.task04;


public class FundBalance {
    int[] balances = {1200, 250, 2000, 500, 3200};
    String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};


    public static void main(String[] args) {
        FundBalance fundBalance = new FundBalance();
        fundBalance.FundingBalance("Oww",100);

    }

    public void FundingBalance(String ownerName, double withdrawal) {
        if (ownerName == "Jane") {
            double balanceAfterFundingJane = balances[0] + withdrawal;
            System.out.println(ownerName + " Balance after funding = " + balanceAfterFundingJane);

        }
        if (ownerName == "Ann") {
            double balanceAfterFundingAnn = balances[1] + withdrawal;
            System.out.println(ownerName + " Balance after funding = " + balanceAfterFundingAnn);
        }
        if (ownerName == "Jack") {
            double balanceAfterFundingJack = balances[2] + withdrawal;
            System.out.println(ownerName + " Balance after funding = " + balanceAfterFundingJack);
        }
        if (ownerName == "Oww") {
            double balanceAfterFundingOww = balances[3] + withdrawal;
            System.out.println(ownerName + " Balance after funding = " + balanceAfterFundingOww);
        }
        if (ownerName == "Lane") {
            double balanceAfterFundingLane = balances[4] + withdrawal;
            System.out.println(ownerName + " Balance after funding = " + balanceAfterFundingLane);

        }
    }
}

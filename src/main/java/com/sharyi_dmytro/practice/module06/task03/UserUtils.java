package com.sharyi_dmytro.practice.module06.task03;


import com.sharyi_dmytro.practice.module06.task02.User;

import java.util.Arrays;

public final class UserUtils {
    private UserUtils() {
    }

    public static User[] uniqueUsers(User[] users) {
        User[] uniqueUsersArray = new User[0];
        int nulls = 0;
        for (int i = 0; i < users.length; i++) {
            for (int j = 1 + i; j < users.length; j++) {
                if (users[i] != null && users[j] != null && users[i].equals(users[j])) {
                    nulls++;
                    users[j] = null;


                }

            }
            uniqueUsersArray = Arrays.copyOf(users, users.length - nulls);
        }
        System.out.println("Unique Users Array = " + Arrays.toString(uniqueUsersArray));
        return uniqueUsersArray;
    }


    static User[] usersWithContitionalBalanceArray = new User[0];

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                usersWithContitionalBalanceArray = addNewElement(usersWithContitionalBalanceArray, users[i]);
            }

        }
        System.out.println("Users With Contitional Balance Array = " + Arrays.toString(usersWithContitionalBalanceArray));
        return usersWithContitionalBalanceArray;

    }

    public static final User[] paySalaryToUsers(User[] users) {
        User[] paySalaryToUsers = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            paySalaryToUsers[i] = new User(i + 1, users[i].getFirstName(), users[i].getLastName(), users[i].getSalary(), users[i].getBalance() + users[i].getSalary());


        }
        System.out.println("Pay Salary To Users = " + Arrays.toString(paySalaryToUsers));
        return paySalaryToUsers;


    }

    public static final long[] getUsersId(User[] users) {
        long[] getUsersIdArray = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            getUsersIdArray[i] = users[i].getId();

        }
        System.out.println("Get Users Id Array = " + Arrays.toString(getUsersIdArray));
        return getUsersIdArray;


    }

    public static User[] deleteEmptyUsers(User[] users) {
        User[] deleteEmptyUsersArray = new User[users.length];
        int notNulls = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                users[notNulls] = users[i];
                notNulls++;
                users[notNulls] = users[i];
            }
        }

        deleteEmptyUsersArray = Arrays.copyOf(users, notNulls);

        System.out.println("Array after delete Empty Users =" + Arrays.toString(deleteEmptyUsersArray));
        return deleteEmptyUsersArray;
    }

    public static User[] addNewElement(User[] array, User user) {
        User[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = user;
        return newArray;
    }


}

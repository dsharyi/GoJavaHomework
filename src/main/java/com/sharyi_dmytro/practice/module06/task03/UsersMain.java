package com.sharyi_dmytro.practice.module06.task03;


import com.sharyi_dmytro.practice.module06.task02.User;

public class UsersMain {
    public static void main(String[] args) {

        User[] arrayUsersForUniqueUsers = new User[4];
        arrayUsersForUniqueUsers[0] = new User(2, "Alex", "Dowson", 500, 12000);
        arrayUsersForUniqueUsers[1] = new User(1, "Alex", "Dowson", 500, 12000);
        arrayUsersForUniqueUsers[2] = new User(1, "Alex", "Dowson", 500, 12000);
        arrayUsersForUniqueUsers[3] = new User(2, "Alex", "Dowson", 500, 12000);

        User[] arrayUsersForDelete = new User[5];
        arrayUsersForDelete[1] = new User(2, "Mila", "Brexton", 1200, 18000);
        arrayUsersForDelete[2] = new User(3, "John", "Norfolk", 4500, 1000000);
        //arrayUsersForDelete[3] = new User(1,"Alex","Dowson",500,12000);
        arrayUsersForDelete[4] = new User(1, "Alex", "Dowson", 500, 12000);

        User[] arrayUsersWithContitionalBalance = new User[3];
        arrayUsersWithContitionalBalance[0] = new User(2, "Mila", "Brexton", 1200, 12000);
        arrayUsersWithContitionalBalance[1] = new User(3, "John", "Norfolk", 4500, 1000000);
        arrayUsersWithContitionalBalance[2] = new User(1, "Alex", "Dowson", 500, 12000);

        User[] arrayPaySalaryToUsers = new User[4];
        arrayPaySalaryToUsers[0] = new User(1, "Mila", "Brexton", 1200, 12000);
        arrayPaySalaryToUsers[1] = new User(2, "John", "Norfolk", 4500, 1000000);
        arrayPaySalaryToUsers[2] = new User(3, "Alex", "Dowson", 500, 12000);
        arrayPaySalaryToUsers[3] = new User(4, "Alex", "Dowson", 1500, 12000);


        UserUtils.uniqueUsers(arrayUsersForUniqueUsers);
        UserUtils.deleteEmptyUsers(arrayUsersForDelete);
        UserUtils.usersWithContitionalBalance(arrayUsersWithContitionalBalance, 12000);
        UserUtils.paySalaryToUsers(arrayPaySalaryToUsers);
        UserUtils.getUsersId(arrayPaySalaryToUsers);
    }


}

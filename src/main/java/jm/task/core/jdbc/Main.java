package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Ran","Long",(byte) 45);
        userService.saveUser("Ivan","Phedorv",(byte) 32);
        userService.saveUser("Viktoria","Philippova",(byte) 51);
        userService.saveUser("Dmitriy", "Ivanov",(byte) 27);

        System.out.println(userService.getAllUsers().toString());

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}

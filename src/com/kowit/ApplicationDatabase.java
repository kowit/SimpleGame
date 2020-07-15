package com.kowit;

import Models.User;

import java.util.ArrayList;

public class ApplicationDatabase {

    private static final ArrayList<User> userDb = new ArrayList<User>();

    public static ArrayList<User> initialize() {
        return userDb;
    }

    public static void addUser(User user) {
        System.out.println("user: " + user);
        userDb.add(user);
    }

    public static ArrayList<User> getUserDb() {
        return userDb;
    }
}

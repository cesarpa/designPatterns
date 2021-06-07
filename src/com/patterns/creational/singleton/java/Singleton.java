package com.patterns.creational.singleton.java;

public class Singleton {

    public static void main(String[] args) {
        System.out.println(DatabaseConnection.getInstance());
        System.out.println(DatabaseConnection.getInstance());
    }
}

class DatabaseConnection {

    static DatabaseConnection dbc = new DatabaseConnection();

    private DatabaseConnection() {
        // anyone can instantiate it again
    }

    public static DatabaseConnection getInstance() {
        return dbc;
    }

}

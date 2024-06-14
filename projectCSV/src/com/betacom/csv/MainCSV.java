package com.betacom.csv;

import objects.User;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainCSV {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("John", "Smith", "male", "01/02/1997"));
        users.add(new User("Jane", "Doe", "female", "15/03/1990"));
        users.add(new User("Michael", "Johnson", "male", "20/07/1985"));
        users.add(new User("Emily", "Williams", "female", "11/10/1995"));
        users.add(new User("David", "Brown", "male", "25/02/1988"));
        users.add(new User("Sarah", "Miller", "female", "18/09/1992"));
        users.add(new User("Matthew", "Davis", "male", "30/12/1983"));
        users.add(new User("Jennifer", "Wilson", "female", "04/05/1991"));
        users.add(new User("Daniel", "Martinez", "male", "08/12/1987"));
        users.add(new User("Jessica", "Garcia", "female", "23/06/1989"));

        users.sort((u1, u2) -> u1.getCognome().compareTo(u2.getCognome()));

        String filePath = "C:\\IntelliJ\\Academy\\Files\\User.csv";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (User user : users) {
                writer.write(user.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

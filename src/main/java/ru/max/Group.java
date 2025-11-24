package ru.max;

import java.util.Arrays;

public class Group {
    private String name;
    private User[] users;

    public Group(String name, User[] users) {
        this.name = name;
        this.users = users;
    }

    public void addUser(User user) {

    }

    public void sendMessageInGroup(Message message) {
        // Вызываем putMessageInArray()
    }

    public String toString() {
        return "";
    }
}
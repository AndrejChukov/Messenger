package ru.max;

import java.util.Arrays;

public class Channel {
    private String name;
    private User[] users;
    private User owner;

    public Channel(String name, User[] users, User owner) {
        this.name = name;
        this.users = users;
        this.owner = owner;
    }

    public void addUser(User user) {

    }

    public void sendMessageInChannel(Message message) {
        // Вызываем putMessageInArray()
    }

    public String toString() {
        return "";
    }
}
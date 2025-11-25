package ru.max;

import java.util.Arrays;

public class Channel {
    private String name;
    private User[] users;
    private User owner;
    private int countUsers = 0;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public User[] getUsers() {
        return users;
    }

    public Channel(String name, User[] users, User owner) {
        this.name = name;
        this.countUsers = users.length;
        for (int i = 0; i < countUsers; i++) {
            this.users[i] = users[i];
        }
        this.owner = owner;
    }

    public void addUser(User user) {
        if (countUsers < users.length) {
            users[countUsers++] = user;
        }
    }

    public void sendMessageInChannel(Message message) {
        // Вызываем Message.putMessageInArray()
        if (message.getSender().getName().equals(owner.getName()))
            Message.putMessageInArray(message);
    }

    public String toString() {
        return "Канал: " + name + "\nВладелец: " + owner.getName() + "\n\nПользователи:\n" + Arrays.toString(users) + "\n";
    }
}
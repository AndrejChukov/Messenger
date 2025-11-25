package ru.max;

import java.util.Arrays;

public class Group {
    private String name;
    private User[] users = new User[100];
    private int countUsers = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group(String name, User[] users) {
        this.name = name;
        this.countUsers = users.length;
        for (int i = 0; i < countUsers; i++) {
            this.users[i] = users[i];
        }
    }

    public void addUser(User user) {
        if (countUsers < users.length) {
            users[countUsers++] = user;
        }
    }

    public void sendMessageInGroup(Message message) {
        // Вызываем Message.putMessageInArray()
        Message.putMessageInArray(message);
    }

    public String toString() {
        return "Группа: " + name + "\n\nПользователи:\n" + Arrays.toString(users) + "\n";
    }
}
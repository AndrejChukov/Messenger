package ru.max;

import java.util.Arrays;

public class Group {
    private String name;
    private User[] users;
    private static String[] messages;

    public Group(String name, User[] users) {
        this.name = name;
        this.users = users;
    }

    public void addUser(User user) {

    }

    public void sendMessageInChat(User sender, String textMessage) {
        // Создаём экземпляр класса Message,
        // С конструктором Message для чата.
        // Добавляем сообщение в массив message.
    }

    public static String[] getMessages() {
        return messages;
    }

    public String toString() {
        return Arrays.toString(users);
    }
}
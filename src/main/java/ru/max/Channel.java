package ru.max;

import java.util.Arrays;

public class Channel {
    private String name;
    private User[] users;
    private User owner;
    private static String[] messages;

    public Channel(String name, User[] users, User owner) {
        this.name = name;
        this.users = users;
        this.owner = owner;
    }

    public void addUser(User user) {

    }

    public void sendMessageInChannel(User sender, String textMessage) {
        // Проверка на то что sender это владелец(owner), если нет, то прерываем метод
        // Создаём экземпляр класса Message,
        // С конструктором Message для группы
        // Добавляем сообщение в массив messages.
    }

    public static String[] getMessages() {
        return messages;
    }

    public String toString() {
        return Arrays.toString(users);
    }
}

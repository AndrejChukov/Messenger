package ru.max;

public class User {
    private String name;
    private String nickName;
    private String password;
    private static String[] messages;

    public User(String name, String nickName, String password) {
        this.name = name;
        this.nickName = nickName;
        this.password = password;
    }

    public void sendMessage(String text, User recipient) {
        // Логика отправки сообщения другому пользователю
        // Создание экземпляра класса Message
    }

    public static String[] getMessages() {
        return messages;
    }

}

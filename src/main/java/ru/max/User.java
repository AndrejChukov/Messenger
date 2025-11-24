package ru.max;

public class User {
    private String name;
    private String nickName;
    private String password;

    public User(String name, String nickName, String password) {
        this.name = name;
        this.nickName = nickName;
        this.password = password;
    }

    public void sendMessage(Message message) {
        // Вызываем putMessageInArray(). Т.е. кладём сообщение в массив сообщений
    }

}

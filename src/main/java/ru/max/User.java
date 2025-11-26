package ru.max;
import java.util.Arrays;
public class User {
    private String name;
    private String nickName;
    private String password;
    private static User[] users = new User[100];
    private static int countUsers = 0;

    public User(String name, String nickName, String password) {
        this.name = name;
        this.nickName = nickName;
        this.password = password;
        users[countUsers] = this;
        countUsers++;
    }

    public static User[] getUsers() {
        return Arrays.copyOfRange(users, 0, countUsers);
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void sendMessage(Message message) {
        // Вызываем putMessageInArray(). Т.е. кладём сообщение в массив сообщений
        Message.putMessageInArray(message);
    }
    public String toString() {
        return "Имя: " + name + ", Иия пользователя: " + nickName;
    }
}

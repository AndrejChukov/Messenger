package ru.max;

public class Message {

    private User sender;
    private User recipient;
    private String text;
    private String date;

    public Message(User sender, Channel recipient, String text, String date) {

    }

    public Message(User sender, Group recipient, String text, String date) {

    }

    public Message(User sender, User recipient, String text, String date) {

    }
}

package ru.max;

public class Message {

    private User sender;
    private User userRecipient;
    private Channel channelRecipient;
    private Group groupRecipient;
    private String text;
    private String date;

    private static Message[] allMessages = new Message[100];
    private static int countMessages = 0;

    public void putMessageInArray(Message message) {
        // Кладём сообщение в массив сообщений
    }

    public Message(User sender, Channel recipient, String text, String date) {
        this.sender = sender;
        this.channelRecipient = recipient;
        this.text = text;
        this.date = date;
    }

    public Message(User sender, Group recipient, String text, String date) {
        this.sender = sender;
        this.groupRecipient = recipient;
        this.text = text;
        this.date = date;
    }

    public Message(User sender, User recipient, String text, String date) {
        this.sender = sender;
        this.userRecipient = recipient;
        this.text = text;
        this.date = date;
    }

    public static void printAllMessages() {
        // Вывод всех сообщений
    }

    public String toString() {
        // переопределение метода toString()
        return "";
    }
}

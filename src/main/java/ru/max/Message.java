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

    public static void putMessageInArray(Message message) {
        // Кладём сообщение в массив сообщений
        if (countMessages < allMessages.length) {
            allMessages[countMessages] = message;
            countMessages++;
        } else {
            System.out.println("Массив сообщений переполнен");
        }
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
        for (int i = 0; i < countMessages; ++i) {
            System.out.println(allMessages[i]);
        }
    }

    public User getSender() {
        return sender;
    }

    public String toString() {
        // переопределение метода toString()
        if (userRecipient != null) {
            return "Отправитель: " + sender.getName() + ", получатель: " + userRecipient.getName()
                    + ", Сообщение: " + text + ", Дата: " + date;
        }

        else if (channelRecipient != null) {
            return "Отправитель: " + sender.getName() + ", получатель: " + channelRecipient.getName()
                    + ", Сообщение: " + text + ", Дата: " + date;
        }

        else {
            return "Отправитель: " + sender.getName() + ", получатель: " + groupRecipient.getName()
                    + ", Сообщение: " + text + ", Дата: " + date;
        }
    }
}

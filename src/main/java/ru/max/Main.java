package ru.max;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User mike = new User("Michael", "mike", "somePassword");
        User margarite = new User("Margarita", "marta", "pass");

        mike.sendMessage(new Message(mike, margarite, "Hello, Marta!", "18:42 24.11.2025"));
        margarite.sendMessage(new Message(margarite, mike, "Hello, Mike! How are you?", "19:00 24.11.2025"));

        Group someGroup = new Group("very big chat", new User[]{mike, margarite});
        someGroup.sendMessageInGroup(new Message(mike, someGroup, "Hello everyone!", "22:00 24.11.2025"));
        someGroup.sendMessageInGroup(new Message(margarite, someGroup, "Hi, Mike!", "21:00 24.11.2025"));

        Channel someChannel = new Channel("News", new User[]{mike, margarite}, mike);
        someChannel.sendMessageInChannel(new Message(mike, someChannel, "Hi, this is my channel", "20:43 24.11.2025"));
        someChannel.sendMessageInChannel(new Message(margarite, someChannel, "This channel is mine!", "21:54 24.11.2025"));

        Message.printAllMessages();
        System.out.println();
        System.out.println(Arrays.toString(User.getUsers()));
    }
}

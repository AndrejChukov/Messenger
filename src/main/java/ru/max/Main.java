package ru.max;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User mike = new User("Michael", "mike", "somePassword");
        User margarite = new User("Margarita", "marta", "pass");

        mike.sendMessage("Hello, Marta!", margarite);
        margarite.sendMessage("Hello, Mike! How are you?", mike);

        Group someGroup = new Group("very big chat", new User[]{mike, margarite});
        someGroup.sendMessageInChat(mike, "Hello everyone!");
        someGroup.sendMessageInChat(margarite, "Hi, Mike!");

        Channel someChannel = new Channel("News", new User[]{mike, margarite}, mike);
        someChannel.sendMessageInChannel(mike, "Hi, this is my channel");
        someChannel.sendMessageInChannel(margarite, "This channel is mine!");

        System.out.println(Arrays.toString(User.getMessages()));
        System.out.println(Arrays.toString(Group.getMessages()));
        System.out.println(Arrays.toString(Channel.getMessages()));
    }
}

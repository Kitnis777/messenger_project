package com.kat.messenger_project;

public class Messenger {
    private static final String MESSAGE_ONE = "\nHello! This is Kitnis!";
    private static final String MESSAGE_TWO = "Hi! How are the kittens doing today?";
    private static final String MESSAGE_THREE = "Hey you!";
    private static final String VIP_STRING = "Very important string!!!";

    public void showMessageOne() {
        System.out.println(MESSAGE_ONE);
    }

    public void showMessageTwo() {
        System.out.println(MESSAGE_TWO);
    }

    public void showMessageThree() {
        System.out.println(MESSAGE_THREE);
    }

    public void printVeryImportantString() {
        System.out.println(VIP_STRING);
    }
}
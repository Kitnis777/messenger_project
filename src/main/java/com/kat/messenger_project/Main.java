package com.kat.messenger_project;

public class Main {
    public static void main(String[] args) {
        printNumbers();

        Messenger messenger = new Messenger();
        messenger.showMessageOne();
        messenger.showMessageTwo();
        messenger.showMessageThree();
    }

    public static void printNumbers() {
        System.out.println("Hey You!");
        for (int i = 1; i <= 20; i++) {
            System.out.println("Very important print!");
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
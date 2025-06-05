package com.kat.messenger_project;

public class Main {
    public static void main(String[] args) {
        printNumbers();

        Messenger messenger = new Messenger();
        messenger.showMessageOne();
        messenger.showMessageTwo();
        messenger.showMessageThree();
        messenger.showMessageFour();
    }

    public static void printNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
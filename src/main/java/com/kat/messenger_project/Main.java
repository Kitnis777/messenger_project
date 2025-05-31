package com.kat.messenger_project;

public class Main {
    public static void main(String[] args) {
        printNumbers();

        Messenger messenger = new Messenger();
        messenger.showMessageOne();
        messenger.showMessageTwo();
    }
    public static void printNumbers(){
        for (int i = 1; i <= 20; i++ ) {
            System.out.print(i + " ");
        }
    }
}
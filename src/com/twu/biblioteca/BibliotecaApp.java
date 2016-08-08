//package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        MessagePrinter messages = new MessagePrinter();
        Menu menu = new Menu();
        messages.welcome();

        menu.showOptions();
    }

}

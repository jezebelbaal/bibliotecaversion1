//package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by jutsch on 8/8/16.
 */
public class Menu {

    public ArrayList<MenuOption> defaultOptions =  new ArrayList<MenuOption>();
    public ArrayList<MenuOption> bookOptions =  new ArrayList<MenuOption>();

    public Menu() {

        MenuOption availableBooks = new MenuOption(0, "Listing all available books");
        MenuOption quit = new MenuOption(1, "Quit");

        defaultOptions.add(availableBooks);
        defaultOptions.add(quit);

        MenuOption detailsBook = new MenuOption(0, "See details");
        MenuOption checkoutBook = new MenuOption(1, "Checkout available book");
        MenuOption returnBook = new MenuOption(2, "Return book");

        bookOptions.add(detailsBook);
        bookOptions.add(checkoutBook);
        bookOptions.add(returnBook);

    }

    public void showOptions(){

        for(int i = 0; i<defaultOptions.size(); i++){

            MenuOption option = defaultOptions.get(i);
            System.out.println("Press® " + String.valueOf(option.id) + ": " + option.label);
        }
    }
}

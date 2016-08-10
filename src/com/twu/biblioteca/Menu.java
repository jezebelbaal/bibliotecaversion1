package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by jutsch on 8/8/16.
 */
public class Menu {

    public ArrayList<MenuOption> defaultOptions =  new ArrayList<MenuOption>();
    public ArrayList<MenuOption> bookOptions =  new ArrayList<MenuOption>();

    public Menu() {

        MenuOption quit = new MenuOption(0, "Quit");
        MenuOption availableBooks = new MenuOption(1, "Listing all available books");
        MenuOption checkoutBook = new MenuOption(2, "Checkout available book");
        MenuOption returnBook = new MenuOption(3, "Return book");

        defaultOptions.add(quit);
        defaultOptions.add(availableBooks);
        defaultOptions.add(checkoutBook);
        defaultOptions.add(returnBook);

    }

    public void showOptions(){

        for(int i = 0; i<defaultOptions.size(); i++){

            MenuOption option = defaultOptions.get(i);
            System.out.println("Press " + String.valueOf(option.id) + ": " + option.label);
        }
    }


}

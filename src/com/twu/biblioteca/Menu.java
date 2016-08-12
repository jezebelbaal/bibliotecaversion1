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
        MenuOption availableMovies = new MenuOption(2, "Listing all available movies");
        MenuOption checkoutBook = new MenuOption(3, "Checkout available book");
        MenuOption returnBook = new MenuOption(4, "Return book");
        MenuOption checkoutMovie = new MenuOption(5, "Checkout movie");
        MenuOption returnMovie = new MenuOption(6, "Return movie");

        defaultOptions.add(quit);
        defaultOptions.add(availableBooks);
        defaultOptions.add(availableMovies);
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

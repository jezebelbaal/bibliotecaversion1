package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jutsch on 8/8/16.
 */
public class Controller {

    MessagePrinter messages = new MessagePrinter();
    Scanner scan = new Scanner(System.in);
    Menu menu = new Menu();
    ArrayList booksList = new ArrayList<Book>();
    BookCollection bookCollection = new BookCollection();


    public boolean status = true;

    public void quit(){
        status = false;
    }

    public void run(){

        messages.welcome();

        while(status == true){
            choose();
        }

    }

    public void choose(){

        menu.showOptions();
        int userEntry = Integer.parseInt(scan.next());

        try {
            menu.defaultOptions.get(userEntry);

            if(userEntry == 0){
                status = false;
                messages.end();
            }else{
                switch(userEntry){
                    case 1: messages.printAvailableBooks(bookCollection.getAvailable());
                }
            }

        } catch ( IndexOutOfBoundsException e ) {
            messages.invalidEntry();
        }
    }
}

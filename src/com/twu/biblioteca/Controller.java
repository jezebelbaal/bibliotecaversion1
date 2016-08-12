package com.twu.biblioteca;

import java.util.Scanner;

/**
 * Created by jutsch on 8/8/16.
 */
public class Controller {

    MessagePrinter messages = new MessagePrinter();
    Scanner scan = new Scanner(System.in);
    Menu menu = new Menu();
    MediaCollection mediaCollection = new MediaCollection();
    UserCollection userCollection = new UserCollection();

    public void quit(){
        userCollection.setSession(false);
    }

    public void run(){

        messages.welcome();

        while(!userCollection.isSession()){
            userCollection.setSession(login());
        }
        while (userCollection.isSession()){
            choose();
        }

    }

    public void choose(){

        menu.showOptions();
        int userEntry = Integer.parseInt(scan.next());

        try {
            menu.defaultOptions.get(userEntry);

            if(userEntry == 0){
                userCollection.setSession(false);
                messages.end();
            }else{
                switch(userEntry){
                    case 1:
                        messages.printAvailableBooks(mediaCollection.getAvailableBooks());
                        break;
                    case 2:
                        messages.printAvailableMovies(mediaCollection.getAvailableMovies());
                        break;
                    case 3:
                        checkoutBook();
                        break;
                    case 4:
                        returnBook();
                        break;
                    case 5:
                        checkoutMovie();
                        break;
                    case 6:
                        returnMovie();
                        break;
                }
            }

        } catch ( IndexOutOfBoundsException e ) {
            messages.invalidEntry();
        }
    }

    public void checkoutBook(){

        messages.bookCodeEntry();
        int bookCode = Integer.valueOf(scan.next());
        try{

            if(mediaCollection.books.get(bookCode).isAvailable()){
                mediaCollection.books.get(bookCode).setRentUser(userCollection.getActiveUser());
                messages.successfulBookCheckout();
            }else{
                messages.bookUnavailable();
            }

        }catch ( IndexOutOfBoundsException e ) {

            messages.invalidEntry();
            messages.unsuccessfulCheckout();
        }
    }

    public void returnBook(){
        messages.bookCodeEntry();
        int bookCode = Integer.valueOf(scan.next());
        try{
            if(!mediaCollection.books.get(bookCode).isAvailable()){

                mediaCollection.books.get(bookCode).setRentUser(userCollection.getActiveUser());
                messages.successfulReturn();

            }else{
                messages.unsuccessfulReturn();
            }
        }catch ( IndexOutOfBoundsException e ) {

            messages.invalidEntry();
            messages.unsuccessfulReturn();
        }
    }

    public void checkoutMovie(){

        messages.movieCodeEntry();
        int movieCode = Integer.valueOf(scan.next());
        try{

            if(mediaCollection.movies.get(movieCode).isAvailable()){
                mediaCollection.movies.get(movieCode).setRentUser(userCollection.getActiveUser());
                messages.successfulMovieCheckout();
            }else{
                messages.movieUnavailable();
            }

        }catch ( IndexOutOfBoundsException e ) {

            messages.invalidEntry();
            messages.unsuccessfulCheckout();
        }
    }

    public void returnMovie(){
        messages.movieCodeEntry();
        int movieCode = Integer.valueOf(scan.next());
        try{
            if(!mediaCollection.books.get(movieCode).isAvailable()){

                mediaCollection.books.get(movieCode).setRentUser(null);
                messages.successfulReturn();

            }else{
                messages.unsuccessfulReturn();
            }
        }catch ( IndexOutOfBoundsException e ) {

            messages.invalidEntry();
            messages.unsuccessfulReturn();
        }
    }

    public boolean login(){

        messages.loginEntry();
        String login = scan.next();
        messages.passwordEntry();
        String password = scan.next();

        if(userCollection.credentials(login, password)!=null){
            return true;
        }
        return false;
    }
}

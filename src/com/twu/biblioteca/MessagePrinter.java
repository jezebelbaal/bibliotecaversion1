package com.twu.biblioteca;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jutsch on 8/8/16.
 */
public class MessagePrinter {

    public String welcome = "Welcome to Biblioteca 1.0!";
    public String end = "You are logged out of Biblioteca.";
    public String invalidEntry = "Invalid Entry! Please, try again.";
    public String successfulCheckout = "Successful Checkout!";
    public String unsuccessfulCheckout = "Error on checking out.";
    public String successfulReturn = "Successful Return!";
    public String unsuccessfulReturn = "Error on returning.";


    public void welcome(){
        System.out.println(this.welcome);
    }

    public void end(){
        System.out.println(this.end);
    }

    public void invalidEntry(){
        System.out.println(this.invalidEntry);
    }

    public void successfulCheckout(){
        System.out.println(this.successfulCheckout);
    }

    public void unsuccessfulCheckout(){
        System.out.println(this.unsuccessfulCheckout);
    }

    public void successfulReturn(){
        System.out.println(this.successfulReturn);
    }

    public void unsuccessfulReturn(){
        System.out.println(this.unsuccessfulReturn);
    }

    public void printAvailableBooks(ArrayList<Book> books){

        System.out.println("Available Books\n");
        Iterator <Book> iterator = books.iterator();
        while(iterator.hasNext()){

            Book book = iterator.next();
            System.out.println("Id code: " + book.id);
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("Year: " + String.valueOf(book.year));
            System.out.println("\n ============ \n");
        }

    }

}

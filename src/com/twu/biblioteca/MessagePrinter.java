//package com.twu.biblioteca;

/**
 * Created by jutsch on 8/8/16.
 */
public class MessagePrinter {

    public String welcome = "Welcome to Biblioteca 1.0!";
    public String end = "You are logged out of Biblioteca.";
    public String invalidEntry = "Invalid Entry! Please, try again.";
    public String successfulCheckout = "";
    public String unsuccessfulCheckout = "";
    public String successfulReturn = "";
    public String unsuccessfulReturn = "";


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

}

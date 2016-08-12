package com.twu.biblioteca;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jutsch on 8/8/16.
 */
public class MessagePrinter {

    public String welcome = "Welcome to Biblioteca 1.0!";
    public String loginEntry = "Please, input your login number";
    public String passwordEntry = "Please, input your password number";
    public String end = "You are logged out of Biblioteca.";
    public String invalidEntry = "Invalid Entry! Please, try again.";
    public String successfulBookCheckout = "Thank you! Enjoy the book!";
    public String successfulMovieCheckout = "Thank you! Enjoy the movie!";
    public String unsuccessfulCheckout = "Error on checking out.";
    public String successfulReturn = "Successful Return!";
    public String unsuccessfulReturn = "Error on returning.";
    public String bookCodeEntry = "Please input the book code";
    public String movieCodeEntry = "Please input the movie code";
    public String bookUnavailable = "Unavailable book";
    public String movieUnavailable = "Unavailable movie";

    public void welcome(){
        System.out.println(this.welcome);
    }

    public void loginEntry(){ System.out.println(this.loginEntry); }

    public void passwordEntry() { System.out.println(this.passwordEntry); }

    public void end(){
        System.out.println(this.end);
    }

    public void invalidEntry(){
        System.out.println(this.invalidEntry);
    }

    public void successfulBookCheckout(){
        System.out.println(this.successfulBookCheckout);
    }
    public void successfulMovieCheckout(){
        System.out.println(this.successfulMovieCheckout);
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

    public void bookCodeEntry(){ System.out.println(this.bookCodeEntry);}

    public void movieCodeEntry(){ System.out.println(this.movieCodeEntry);}

    public void bookUnavailable(){
        System.out.println(this.bookUnavailable);
    }
    public void movieUnavailable(){
        System.out.println(this.movieUnavailable);
    }

    public void printAvailableBooks(ArrayList<Book> books){

        System.out.println("Available Books\n");
        Iterator <Book> iterator = books.iterator();
        while(iterator.hasNext()){

            Book book = iterator.next();
            System.out.println("Id code: " + book.getId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Year: " + String.valueOf(book.getYear()));
            System.out.println("\n ============ \n");
        }

    }

    public void printAvailableMovies(ArrayList<Movie> movies){

        System.out.println("Available Books\n");
        Iterator <Movie> iterator = movies.iterator();
        while(iterator.hasNext()){

            Movie movie = iterator.next();
            System.out.println("Id code: " + movie.getId());
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Author: " + movie.getDirector());
            System.out.println("Year: " + String.valueOf(movie.getYear()));
            System.out.println("Rate: " + String.valueOf(movie.getRate()));
            System.out.println("\n ============ \n");
        }
    }

}

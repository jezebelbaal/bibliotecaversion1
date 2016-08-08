package com.twu.biblioteca;

/**
 * Created by jutsch on 8/8/16.
 */
public class Book {

    public String title;
    public String author;
    public boolean available;
    public int year;

    public Book(String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    public void setAvailable(){
        this.available = false;
    }

    public void setUnavailable(){
        this.available = true;
    }
}

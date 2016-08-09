package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by jutsch on 8/8/16.
 */
public class BookCollection {

    public ArrayList<Book> books =  new ArrayList<Book>();

    public BookCollection(ArrayList<Book> books) {

        this.books = books;
    }

    public ArrayList getAvailable(){

        ArrayList<Book> availableBooks = new ArrayList<Book>();
        for(int i = 0; i<books.size(); i++){
            if(books.get(i).available == true){
                availableBooks.add(books.get(i));
            }
        }
        return availableBooks;
    }


}

package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by jutsch on 8/8/16.
 */
public class BookCollection {

    public ArrayList<Book> books =  new ArrayList<Book>();

    public BookCollection() {

        Book frankenstein = new Book("Frankenstein", "Mary Shelley", 1831, true);
        Book antiOedipus = new Book ("The Anti Oedipus", "Gilles Deleuze", 1972, true);
        Book lostIllusions = new Book ("Lost Illusions", "Balzac", 1893, true);
        Book jockey = new Book ("Jockey", "Matilde Campilho", 2015, true);

        books.add(frankenstein);
        books.add(antiOedipus);
        books.add(lostIllusions);
        books.add(jockey);
    }

    public ArrayList getAvailable(){

        ArrayList<Book> availableBooks = new ArrayList<Book>();
        for(int i = 0; i<books.size(); i++){
            if(books.get(i).available == true){
                availableBooks.add(books.get(i));
            }
        }
        return books;
    }


}

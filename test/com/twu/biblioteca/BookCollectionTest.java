package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by jutsch on 8/8/16.
 */

public class BookCollectionTest {

    public ArrayList books;

    public BookCollectionTest() {

        ArrayList<Book> books = new ArrayList<Book>();

        Book frankenstein = new Book("Frankenstein", "Mary Shelley", 1831, true);
        Book antiOedipus = new Book ("The Anti Oedipus", "Gilles Deleuze", 1972, true);
        Book lostIllusions = new Book ("Lost Illusions", "Balzac", 1893, true);
        Book jockey = new Book ("Jockey", "Matilde Campilho", 2015, true);

        books.add(frankenstein);
        books.add(antiOedipus);
        books.add(lostIllusions);
        books.add(jockey);

        this.books = books;
    }

    @Test
    public void testsIfIsThereABookList() throws Exception{

        BookCollection collection = new BookCollection(books);
        assertTrue(collection.books.size()>0);
    }

    @Test
    public void testsIfFrankensteinExists() throws Exception{

        Book frankenstein = new Book("Frankenstein", "Mary Shelley", 1831, true);
        BookCollection collection = new BookCollection(books);
        assertEquals(collection.books.get(0).author, frankenstein.author);
    }

    @Test
    public void testsIfOnlyAvailableBooksAreListed() throws Exception{

        BookCollection collection = new BookCollection(books);
        collection.books.get(0).available = false;

        //assertEquals();collection.getAvailable()
    }
}
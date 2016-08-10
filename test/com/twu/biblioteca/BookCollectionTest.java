package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jutsch on 8/8/16.
 */

public class BookCollectionTest {


    @Test
    public void testsIfIsThereABookList() throws Exception{

        BookCollection collection = new BookCollection();
        assertTrue(collection.books.size()>0);
    }

    @Test
    public void testsIfFrankensteinExists() throws Exception{

        Book frankenstein = new Book("Frankenstein", "Mary Shelley", 1831, true, 0);
        BookCollection collection = new BookCollection();

        assertEquals(collection.books.get(0).title, frankenstein.title);
    }

    @Test
    public void testsIfOnlyAvailableBooksAreListed() throws Exception{

        BookCollection collection = new BookCollection();
        collection.books.get(0).setUnavailable();
        assertEquals(collection.getAvailable().size(), 3);
    }
}
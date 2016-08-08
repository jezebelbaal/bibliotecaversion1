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

        Book frankenstein = new Book("Frankenstein", "Mary Shelley", 1831, true);
        BookCollection collection = new BookCollection();
        assertEquals(collection.books.get(0).author, frankenstein.author);
    }

    @Test
    public void testsIfAvailableBooksAreListed() throws Exception{

        BookCollection collection = new BookCollection();
        assertTrue(collection.books.size()>0);
    }
}
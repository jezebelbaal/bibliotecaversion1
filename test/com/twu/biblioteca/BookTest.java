package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jutsch on 8/8/16.
 */
public class BookTest {

    Book book = new Book("Frankenstein", "Mary Shelley", 1831, true);

    @Test
    public void assertsFrankieBookTitleisSetObject() throws Exception{
        assertEquals(book.title, "Frankenstein");
    }

    public void setUnavailableBook() throws Exception{

        book.setUnavailable();
        assertEquals(book.available, false);
    }
}
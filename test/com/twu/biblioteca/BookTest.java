package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jutsch on 8/8/16.
 */
public class BookTest {

    @Test
    public void assertsFrankieBookTitleisSetObject() throws Exception{
        Book book = new Book("Frankenstein", "Mary Shelley", 1831, true);
        assertEquals(book.title, "Frankenstein");
    }

}
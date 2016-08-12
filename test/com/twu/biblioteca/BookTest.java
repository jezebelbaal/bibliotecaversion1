package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jutsch on 8/8/16.
 */
public class BookTest {

    Book book = new Book("Frankenstein", "Mary Shelley", 1831, 0);
    User user = new User("78923-234", "p@ssw0rd!", "Jullie", "jutsch@thoughtworks.com", "991084388");

    @Test
    public void assertsFrankieBookTitleisSetObject() throws Exception{
        assertEquals(book.getTitle(), "Frankenstein");
    }

    @Test
    public void setUnavailableBook() throws Exception{

        book.setRentUser(user);
        assertEquals(book.isAvailable(), false);
    }
}
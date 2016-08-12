package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jutsch on 8/8/16.
 */

public class MediaCollectionTest {

    MediaCollection collection = new MediaCollection();
    User user = new User("78923-234", "p@ssw0rd!", "Jullie", "jutsch@thoughtworks.com", "991084388");

    @Test
    public void testsIfThereIsABookList() throws Exception{

        assertTrue(collection.books.size()>0);
    }

    @Test
    public void testsIfFrankensteinExists() throws Exception{

        Book frankenstein = new Book("Frankenstein", "Mary Shelley", 1831, 0);
        assertEquals(collection.books.get(0), frankenstein);
    }

    @Test
    public void testsIfOnlyAvailableBooksAreListed() throws Exception{

        collection.books.get(0).setRentUser(user);
        assertEquals(collection.getAvailableBooks().size(), 3);
    }

    @Test
    public void testsIfThereIsAMovieList() throws Exception{
        assertTrue(collection.movies.size()>0);
    }

    @Test
    public void testsIfAquariusExists() throws Exception{
        Movie aquarius = new Movie("Aquarius", "Kleber Mendonça Filho", 2016, 5, 1);
        assertTrue(collection.movies.contains(aquarius));
    }

    @Test
    public void testsIfOnlyAvailableMoviesAreListed() throws Exception{

        collection.movies.get(0).setRentUser(user);
        assertEquals(collection.getAvailableMovies().size(), 3);
    }

}
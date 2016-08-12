package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jutsch on 8/8/16.
 */
public class MovieTest {

    Movie movie = new Movie("La Chinoise", "Jean Luc Godard", 1967, 5, 0);
    User user = new User("78923-234", "p@ssw0rd!", "Jullie", "jutsch@thoughtworks.com", "991084388");

    @Test
    public void assertsChinoiseMovieTitleisSetObject() throws Exception{
        assertEquals(movie.getTitle(), "La Chinoise");
    }

    @Test
    public void setUnavailableMovie() throws Exception{

        movie.setRentUser(user);
        assertEquals(movie.isAvailable(), false);
    }
}
package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by jutsch on 8/8/16.
 */
public class MediaCollection {

    public ArrayList<Book> books = new ArrayList<Book>();
    public ArrayList<Movie> movies = new ArrayList<Movie>();

    public MediaCollection() {

        Book frankenstein = new Book("Frankenstein", "Mary Shelley", 1831, books.size());
        this.books.add(frankenstein);

        Book antiOedipus = new Book ("The Anti Oedipus", "Gilles Deleuze", 1972, books.size());
        this.books.add(antiOedipus);

        Book lostIllusions = new Book ("Lost Illusions", "Balzac", 1893, books.size());
        this.books.add(lostIllusions);

        Book jockey = new Book ("Jockey", "Matilde Campilho", 2015, books.size());
        this.books.add(jockey);

        Movie chinoise = new Movie("La Chinoise", "Jean Luc Godard", 1967, 5, movies.size());
        this.movies.add(chinoise);

        Movie aquarius = new Movie("Aquarius", "Kleber Mendonça Filho", 2016, 5, movies.size());
        this.movies.add(aquarius);

        Movie batguano = new Movie("Batguano", "Tavinho Teixeira", 2014, 4, movies.size());
        this.movies.add(batguano);

        Movie lesCubains = new Movie("Salue les cubains", "Agnès Varda", 1966, 5, movies.size());
        this.movies.add(lesCubains);


    }

    public ArrayList getAvailableBooks(){

        ArrayList<Book> availableBooks = new ArrayList<Book>();

        for(int i = 0; i<this.books.size(); i++){

            if(this.books.get(i).isAvailable()){
                availableBooks.add(this.books.get(i));
            }

        }
        return availableBooks;
    }

    public ArrayList getAvailableMovies(){

        ArrayList<Movie> availableMovies = new ArrayList<Movie>();

        for(int i = 0; i<this.movies.size(); i++){

            if(this.movies.get(i).isAvailable()){
                availableMovies.add(this.movies.get(i));
            }
        }
        return availableMovies;
    }


}

package com.twu.biblioteca;

/**
 * Created by jutsch on 8/11/16.
 */
public class Movie extends Media {

    private String director;
    private int rate;

    public Movie(String title, String director, int year, int rate, int id) {

        setTitle(title);
        setYear(year);
        setDirector(director);
        setId(id);
        this.director = director;
        this.rate = rate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;


        if (getYear() != movie.getYear()) return false;
        if (getId() != movie.getId()) return false;
        if (!getTitle().equals(movie.getTitle())) return false;
        return director.equals(movie.getDirector());
    }
}

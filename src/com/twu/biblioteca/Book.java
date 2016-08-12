package com.twu.biblioteca;

/**
 * Created by jutsch on 8/8/16.
 */
public class Book extends Media {

    private String author;

    public Book(String title, String author, int year, int id) {

        setTitle(title);
        setAuthor(author);
        setYear(year);

        setId(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;


        if (getYear() != book.getYear()) return false;
        if (getId() != book.getId()) return false;
        if (!getTitle().equals(book.getTitle())) return false;
        return author.equals(book.getAuthor());

    }

    @Override
    public int hashCode() {
        int result = getTitle().hashCode();
        result = 31 * result + getAuthor().hashCode();
        result = 31 * result + getYear();
        result = 31 * result + getId();
        return result;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

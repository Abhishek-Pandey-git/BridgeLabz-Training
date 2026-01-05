package com.linkedlist.doublylinkedlist;

/**
 * Represents a movie with title, director, year, and rating.
 */
public class Movie {
    private final String title;
    private final String director;
    private final int yearOfRelease;
    private double rating;

    public Movie(String title, String director, int yearOfRelease, double rating) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Director: " + director 
                + ", Year: " + yearOfRelease + ", Rating: " + rating;
    }
}

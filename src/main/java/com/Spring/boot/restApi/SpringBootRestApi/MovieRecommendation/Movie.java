package com.Spring.boot.restApi.SpringBootRestApi.MovieRecommendation;

public class Movie {

    public int id;
    public String name;
    public double rating;

    public Movie(int id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
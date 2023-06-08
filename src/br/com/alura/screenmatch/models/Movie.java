package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculation.Rateable;

public class Movie extends Title implements Rateable {
    private String director;

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRating() {
        return 0;
    }
}

package br.com.alura.screenmatch.models;

public class Movie extends Title {
    public Movie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    private String director;

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRating() {
        return (int) this.getAverage() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}

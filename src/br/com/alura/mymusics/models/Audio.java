package br.com.alura.mymusics.models;

public class Audio {
    private String title;
    private int totalReproductions;
    private int totalLikes;
    private double rating;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalReproductions() {
        return this.totalReproductions;
    }

    public int getTotalLikes() {
        return this.totalLikes;
    }

    public double getRating() {
        return this.rating;
    }

    public void like() {
        this.totalLikes++;
    }

    public void reproduce() {
        this.totalReproductions++;
    }
}  
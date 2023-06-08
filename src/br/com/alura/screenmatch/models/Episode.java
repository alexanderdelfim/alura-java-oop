package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculation.Rateable;

public class Episode implements Rateable{
    private int number;
    private String name;
    private Serie serie;
    private int totalViews;

    public int getTotalViews() {
        return this.totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return this.serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getRating() {
        if (this.totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}

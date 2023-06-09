package br.com.alura.mymusics.models;

public class Music extends Audio {
    private String album;
    private String artist;
    private String genre;


    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public double getRating() {
        if (getTotalReproductions() > 600) {
            return 10;
        } else {
            return 7;
        }
    }
}

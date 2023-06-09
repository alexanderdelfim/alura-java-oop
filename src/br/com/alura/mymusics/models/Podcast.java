package br.com.alura.mymusics.models;

public class Podcast extends Audio {
    private String announcer;
    private String description;

    public String getAnnouncer() {
        return this.announcer;
    }

    public void setAnnouncer(String announcer) {
        this.announcer = announcer;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double getRating() {
        if (getTotalLikes() > 50) {
            return 10;
        } else {
            return 8;
        }
    }
}

package br.com.alura.screenmatch.models;

public class Serie extends Title {
    public Serie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    private int seasons;
    private int episodesPerSeason;
    private boolean active;
    private int minutesPerEpisode;

    public int getSeasons() {
        return this.seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesPerSeason() {
        return this.episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public boolean isActive() {
        return this.active;
    }

    public boolean getActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMinutesPerEpisode() {
        return this.minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getDurationInMinutes() {
        return this.seasons * this.episodesPerSeason * this.minutesPerEpisode;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}

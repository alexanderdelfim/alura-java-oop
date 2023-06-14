package br.com.alura.screenmatch.app;
import java.util.ArrayList;

import br.com.alura.screenmatch.calculation.Calculator;
import br.com.alura.screenmatch.calculation.RecomendationFilter;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class App {
    public static void main(String[] args) throws Exception {
        Movie myMovie = new Movie("O poderoso chefão", 1970);
        myMovie.setDurationInMinutes(180);
        myMovie.setIncludedInthePlan(true);

        myMovie.displayTechnicalSheet();
        myMovie.evaluate(8);
        myMovie.evaluate(10);
        myMovie.evaluate(5);

        System.out.println("Média de avaliações do filme: " + myMovie.getAverage());
        System.out.println("Duração do filme: " + myMovie.getDurationInMinutes());

        Movie schoolOfRock = new Movie("Escola de rock", 2003);
        schoolOfRock.setDurationInMinutes(109);
        schoolOfRock.setIncludedInthePlan(true);
        schoolOfRock.evaluate(8);
        schoolOfRock.evaluate(10);
        schoolOfRock.evaluate(8);

        Serie arcane = new Serie("Arcane", 2021);
        arcane.setMinutesPerEpisode(41);
        arcane.setIncludedInthePlan(true);
        arcane.setSeasons(1);
        arcane.setEpisodesPerSeason(9);
        arcane.setActive(false);

        arcane.displayTechnicalSheet();
        System.out.println("Duração da série: " + arcane.getDurationInMinutes());

        Calculator timeCalculator = new Calculator();
        timeCalculator.include(myMovie);
        timeCalculator.include(schoolOfRock);
        timeCalculator.include(arcane);
        System.out.println(timeCalculator.getTotalTime());

        RecomendationFilter recomendationFilter = new RecomendationFilter();

        recomendationFilter.filter(schoolOfRock);

        Episode episode = new Episode();
        episode.setName("Arcane: episode 1");
        episode.setNumber(1);
        episode.setSerie(arcane);
        episode.setTotalViews(2000);

        recomendationFilter.filter(episode);
        recomendationFilter.filter(arcane);

        var alexanderMovie = new Movie("Gundam: Hathaway", 2021);
        alexanderMovie.setDurationInMinutes(131);
        alexanderMovie.evaluate(10);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(schoolOfRock);
        movieList.add(myMovie);
        movieList.add(alexanderMovie);

        System.out.println("tamanho da lista " + movieList.size());
        System.out.println("Primeiro filme da lista: " + movieList.get(0).getName());
        System.out.println(movieList);
        System.out.println("toString do filme " + movieList.get(0).toString());

        alexanderMovie.toString();
    }
}

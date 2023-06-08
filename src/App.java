import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class App {
    public static void main(String[] args) throws Exception {
        Movie myMovie = new Movie();
        myMovie.setName("O poderoso chefão");
        myMovie.setReleaseYear(1970);
        myMovie.setDurationInMinutes(180);
        myMovie.setIncludedInthePlan(true);

        myMovie.displayTechnicalSheet();
        myMovie.evaluate(8);
        myMovie.evaluate(10);
        myMovie.evaluate(5);

        System.out.println("Média de avaliações do filme: " + myMovie.getAverage());

        Serie arcane = new Serie();
        arcane.setName("Arcane");
        arcane.setReleaseYear(2021);
        arcane.setMinutesPerEpisode(41);
        arcane.setIncludedInthePlan(true);
        arcane.setSeasons(1);
        arcane.setEpisodesPerSeason(9);
        arcane.setActive(false);
    }
}

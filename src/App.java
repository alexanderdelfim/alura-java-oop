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
    }
}

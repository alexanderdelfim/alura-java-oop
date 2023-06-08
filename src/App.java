public class App {
    public static void main(String[] args) throws Exception {
        Movie myMovie = new Movie();
        myMovie.name = "O poderoso chefão";
        myMovie.releaseYear = 1970;
        myMovie.durationInMinutes = 180;

        myMovie.displayTechnicalSheet();
        myMovie.evaluate(8);
        myMovie.evaluate(10);
        myMovie.evaluate(5);
        System.out.println(myMovie.sumOfEvaluations);
        System.out.println(myMovie.totalOfEvaluations);
        System.out.println(myMovie.getAverage());
    }
}

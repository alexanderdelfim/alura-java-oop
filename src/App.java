public class App {
    public static void main(String[] args) throws Exception {
        Movie myMovie = new Movie();
        myMovie.name = "O poderoso chefão";
        myMovie.releaseYear = 1970;
        myMovie.durationInMinutes = 180;

        System.out.println(myMovie.name);
        System.out.println(myMovie.releaseYear);
    }
}

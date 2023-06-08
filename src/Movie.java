public class Movie {
    String name;
    boolean includedInthePlan;
    double sumOfEvaluations;
    int releaseYear;
    int totalOfEvaluations;
    int durationInMinutes;

    void displayTechnicalSheet() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Duração do filme: " + durationInMinutes + " minutos");
    }

    void evaluate(double score) {
        sumOfEvaluations += score;
        totalOfEvaluations++;
    }

    double getAverage() {
        return sumOfEvaluations / totalOfEvaluations;
    }
}

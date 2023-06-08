public class Movie {
    private String name;
    private boolean includedInthePlan;
    private double sumOfEvaluations;
    private int releaseYear;
    private int totalOfEvaluations;
    private int durationInMinutes;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIncludedInthePlan() {
        return this.includedInthePlan;
    }

    public boolean getIncludedInthePlan() {
        return this.includedInthePlan;
    }

    public void setIncludedInthePlan(boolean includedInthePlan) {
        this.includedInthePlan = includedInthePlan;
    }

    public double getSumOfEvaluations() {
        return this.sumOfEvaluations;
    }

    public void setSumOfEvaluations(double sumOfEvaluations) {
        this.sumOfEvaluations = sumOfEvaluations;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getTotalOfEvaluations() {
        return this.totalOfEvaluations;
    }

    public void setTotalOfEvaluations(int totalOfEvaluations) {
        this.totalOfEvaluations = totalOfEvaluations;
    }

    public int getDurationInMinutes() {
        return this.durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    void displayTechnicalSheet() {
        System.out.println("Nome do filme: " + this.name);
        System.out.println("Ano de lançamento: " + this.releaseYear);
        System.out.println("Duração do filme: " + this.durationInMinutes + " minutos");
        System.out.println("Incluído no plano: " + this.includedInthePlan);
    }

    void evaluate(double score) {
        this.sumOfEvaluations += score;
        this.totalOfEvaluations++;
    }

    double getAverage() {
        return this.sumOfEvaluations / this.totalOfEvaluations;
    }
}

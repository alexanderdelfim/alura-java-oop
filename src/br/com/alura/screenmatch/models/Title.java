package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculation.Rateable;

public class Title implements Rateable {
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

    public void displayTechnicalSheet() {
        System.out.println("Nome: " + this.name);
        System.out.println("Ano de lançamento: " + this.releaseYear);
        System.out.println("Incluído no plano: " + this.includedInthePlan);
    }

    public void evaluate(double score) {
        this.sumOfEvaluations += score;
        this.totalOfEvaluations++;
    }

    public double getAverage() {
        return this.sumOfEvaluations / this.totalOfEvaluations;
    }

    @Override
    public int getRating() {
        return (int) this.getAverage() / 2;
    }
}

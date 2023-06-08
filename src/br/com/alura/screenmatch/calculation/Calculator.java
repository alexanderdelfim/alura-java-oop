package br.com.alura.screenmatch.calculation;

import br.com.alura.screenmatch.models.Title;

public class Calculator {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

    public void include (Title title) {
        this.totalTime += title.getDurationInMinutes();
    }
}

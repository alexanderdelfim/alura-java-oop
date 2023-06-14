package br.com.alura.screenmatch.app;

import java.util.ArrayList;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Title;

public class AppWithLists {
    public static void main(String[] args) {
        Movie boss = new Movie("O poderoso chefão", 1970);
        boss.evaluate(8);
        Movie schoolOfRock = new Movie("Escola de rock", 2003);
        schoolOfRock.evaluate(10);
        Movie gundam = new Movie("Gundam: Hathaway", 2021);
        gundam.evaluate(9);
        Serie arcane = new Serie("Arcane", 2021);
        
        ArrayList<Title> list = new ArrayList<>();

        list.add(schoolOfRock);
        list.add(boss);
        list.add(gundam);
        list.add(arcane);

        for (Title item: list) {
            System.out.println(item.getName());
            if (item instanceof Movie movie && movie.getRating() > 2) {
                System.out.println("Classsificação " + movie.getRating());
            }
        }
    }
}

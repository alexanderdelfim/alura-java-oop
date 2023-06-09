package br.com.alura.mymusics.models;

public class Favorites {
    public void include(Audio audio) {
        if (audio.getRating() >= 9) {
            System.out.println(audio.getTitle() + " se tornou sucesso!");
        } else {
            System.out.println(audio.getTitle() + " vem chamando a atenção, e pode virar um sucesso!");
        }
    }
}
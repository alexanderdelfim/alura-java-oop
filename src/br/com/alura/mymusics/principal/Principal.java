package br.com.alura.mymusics.principal;

import br.com.alura.mymusics.models.Favorites;
import br.com.alura.mymusics.models.Music;
import br.com.alura.mymusics.models.Podcast;

public class Principal {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Love from the other side");
        myMusic.setArtist("Fall Out Boys");

        Music otherMusic = new Music();
        otherMusic.setTitle("Okey Dokey");
        otherMusic.setArtist("Zico");

        for (int i = 0; i < 500; i++) {
            myMusic.reproduce();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("NerdCast");
        myPodcast.setAnnouncer("Joven Nerd");

        for (int i = 0; i < 1000; i++) {
            myPodcast.reproduce();
        }

        for (int i = 0; i < 100; i++) {
            myPodcast.like();
        }

        Favorites myFavorites = new Favorites();
        myFavorites.include(myPodcast);
        myFavorites.include(myMusic);
        myFavorites.include(otherMusic);
    }
}

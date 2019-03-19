package no.hiof.torama.movietime;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        TvSerie strangerThings = new TvSerie("Stranger Things",
                "When a young boy disappears, his mother, a police chief, and his friends must confront terrifying forces in order to get him back.",
                LocalDate.of(2016, 7,15));


                                //tittel, episodeNummer, sesongNummer, beskrivelse, regissor, spilletid, utgivelsesdato
        Episode episode1 = new Episode("Chapter One: The Vanishing of Will Byers", 1, 1, "Spenning", "Ross Duffer", 50, 2016-07-15);
        Episode episode2 = new Episode("Chapter Two: The Weirdo on Maple Street", 2, 1, "Spenning", "Ross Duffer", 50, 2016-07-15);
        Episode episode3 = new Episode("Chapter Three: Holly, Jolly", 3, 1, "Spenning", "Ross Duffer", 50, 2016-07-15);
        Episode episode4 = new Episode("Chapter Four: The Body", 4, 1, "Spenning", "Ross Duffer", 50, 2016-07-15);
        

        strangerThings.leggTilEpisode(episode1);
        strangerThings.leggTilEpisode(episode2);
        strangerThings.leggTilEpisode(episode3);
        strangerThings.leggTilEpisode(episode4);

        strangerThings.leggTilEpisode(new Episode("Chapter One: MADMAX", 1, 2, 50));
        strangerThings.leggTilEpisode(new Episode("Chapter Two: Trick or Treat, Freak", 2, 2, 50));
        strangerThings.leggTilEpisode(new Episode("Chapter Three: The Pollywog", 3, 2, 50));

        ArrayList<Episode> episodeListe = strangerThings.getEpisodeListe();

        System.out.println("**************************");
        System.out.println("* " + strangerThings + " *");
        System.out.println("**************************");
        System.out.println("-------Alle Episoder------");


        for (Episode enEpisode : episodeListe) {
            System.out.println(enEpisode);
        }

        System.out.println("**************************\n");


        TvSerie gameOfThrones = new TvSerie("Game of Thrones", "They are in a game for the throne.", LocalDate.of(2011, 4, 11));

        Random randomTallGenerator = new Random();

        for (int sesongNr = 1; sesongNr <= 5; sesongNr++) {
            for (int episodeNr = 1; episodeNr <= 20; episodeNr++) {
                gameOfThrones.leggTilEpisode(new Episode("Generic Title", episodeNr, sesongNr, randomTallGenerator.nextInt(11) + 20));
            }
        }

        ArrayList<Episode> gameOfThronesSesong4Episoder = gameOfThrones.hentEpisoderISesong(4);

        System.out.println("**************************");
        System.out.println("* " + gameOfThrones + " *");
        System.out.println("**************************");
        System.out.println("**** Spilletid: " + gameOfThrones.getGjennomSnittligSpilletid() + "min ****");
        System.out.println("**************************");
        System.out.println("-------Episoder S04-------");

        for (Episode enEpisode : gameOfThronesSesong4Episoder) {
            System.out.println(enEpisode);
        }

        System.out.println("**************************");

        gameOfThrones.leggTilEpisode(new Episode("EpisodeISesong10", 1, 10, 50));



        //Oppgave 5
                    //tittel, regissor, beskrivelse, utgivelsesdato, filmAar, spilletid
        Film mammaMia = new Film("Mamma Mia", "Phyllida Lloyd", "Musikal", 2008-07-10, 2008, 109);
        Film mammaMia2 = new Film("Mamma Mia 2", "Ol Parker", "Musikal", 2018-07-20, 2018, 114);
        Film bilerFilmen = new Film("Biler", "John Lasseter", "Barnefilm", 2006-10-26, 2006, 117);
        //Oppgave 5
        System.out.println("***********Filmer*********");
        System.out.println(mammaMia);
        System.out.println(mammaMia2);
        System.out.println(bilerFilmen);

    }
}

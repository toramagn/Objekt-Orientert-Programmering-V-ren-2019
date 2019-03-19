package no.hiof.torama.oblig4;



import no.hiof.torama.oblig4.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //STRANGER THINGS
        TvSerie strangerThings = new TvSerie("Stranger Things",
                "When a young boy disappears, his mother, a police chief, and his friends must confront terrifying forces in order to get him back.",
                LocalDate.of(2016, 7,15));


        //STRANGER THINGS
        //tittel, episodeNummer, sesongNummer, beskrivelse, regissor, spilletid, utgivelsesdato
        LocalDate date = LocalDate.of(2016,07,15);
        Episode episode1 = new Episode("Chapter One: The Vanishing of Will Byers", 1, 1, "Spenning", 50, date);
        Episode episode2 = new Episode("Chapter Two: The Weirdo on Maple Street", 2, 1, "Spenning", 50, date);
        Episode episode3 = new Episode("Chapter Three: Holly, Jolly", 3, 1, "Spenning", 50, date);
        Episode episode4 = new Episode("Chapter Four: The Body", 4, 1, "Spenning", 50, date);

        //STRANGER THINGS
        strangerThings.leggTilEpisode(episode1);
        strangerThings.leggTilEpisode(episode2);
        strangerThings.leggTilEpisode(episode3);
        strangerThings.leggTilEpisode(episode4);

        //STRANGER THINGS
        strangerThings.leggTilEpisode(new Episode("Chapter One: MADMAX", 1, 2, 50));
        strangerThings.leggTilEpisode(new Episode("Chapter Two: Trick or Treat, Freak", 2, 2, 50));
        strangerThings.leggTilEpisode(new Episode("Chapter Three: The Pollywog", 3, 2, 50));

        //STRANGER THINGS
        ArrayList<Episode> episodeListe = strangerThings.getEpisodeListe();

        //STRANGER THINGS
        System.out.println("**************************");
        System.out.println("* " + strangerThings + " *");
        System.out.println("**************************");
        System.out.println("-------Alle Episoder------");

        //STRANGER THINGS - skriver ut liste med episoder
        for (Episode enEpisode : episodeListe) {
            System.out.println(enEpisode);
        }
        System.out.println("**************************\n");

        //GAME OF THRONES
        TvSerie gameOfThrones = new TvSerie("Game of Thrones", "They are in a game for the throne.", LocalDate.of(2011, 4, 11));
        Random randomTallGenerator = new Random();
        ArrayList<Rolle> episodeRoller = new ArrayList<>();

        //GAME OF THRONES
        Person kitH = new Person("Kit", "Harington");
        Rolle jonS = new Rolle("Jon", "Snow", kitH); //Kit Harington
        episodeRoller.add(jonS);

        //GAME OF THRONES
        Person peterD = new Person("Peter", "Dinklage");
        Rolle tyrionL = new Rolle("Tyrion", "Lannister", peterD);
        episodeRoller.add(tyrionL);

        //GAME OF THRONES
        Person sophieT = new Person("Sophie", "Turner");
        Rolle sansaS = new Rolle("Sansa", "Stark", sophieT);
        episodeRoller.add(sansaS);

        //GAME OF THRONES
        for (int sesongNr = 1; sesongNr <= 5; sesongNr++) {
            for (int episodeNr = 1; episodeNr <= 5; episodeNr++) {
                Episode episodeRDM = new Episode("Generic Title", episodeNr, sesongNr, randomTallGenerator.nextInt(11) + 20);
                gameOfThrones.leggTilEpisode(episodeRDM);
                episodeRDM.leggTilMangeRoller(episodeRoller);
            }
        }
        ArrayList<Episode> gameOfThronesSesong4Episoder = gameOfThrones.hentEpisoderISesong(4);

        //GAME OF THRONES
        System.out.println("**************************");
        System.out.println("* " + gameOfThrones + " *");
        System.out.println("**************************");
        System.out.println("Gjennomsnittligspilletid: " + gameOfThrones.getGjennomSnittligSpilletid() + "min.");
        System.out.println("**************************");
        System.out.println("-------Episoder S04-------");

        //GAME OF THRONES - skriver ut liste med episoder
        for (Episode enEpisode : gameOfThronesSesong4Episoder) {
            System.out.println(enEpisode);
        }
        System.out.println("**************************");
        System.out.println();

        //GAME OF THRONES
        gameOfThrones.leggTilEpisode(new Episode("EpisodeISesong10", 1, 10, 50));


        //------------------------------------------------------------------------------------------------------------


        //OBLIG3 - Oppgave 5
        LocalDate dateMM1 = LocalDate.of(2008,07,10);
        LocalDate dateHG = LocalDate.of(2012,03,23);
        LocalDate dateB = LocalDate.of(2006,10,26);

        //OBLIG3 - tittel, beskrivelse, utgivelsesdato, filmAar, spilletid
        Film mammaMia = new Film("Mamma Mia", "Musikal", dateMM1, 109);
        Film hungerGames = new Film("Hunger Games", "Action-science-fiction", dateHG, 114);
        Film bilerFilmen = new Film("Biler", "Barnefilm", dateB,117);

        //OBLIG3 - Oppave 7 - oppretter regissorer
        Person phyllidaLloyd = new Person("Phyllida","Lloyd");
        mammaMia.setRegissor(phyllidaLloyd);
        Person garyRoss = new Person("Gary","Ross");
        hungerGames.setRegissor(garyRoss);
        Person johnLasseter = new Person("John","Lasseter");
        bilerFilmen.setRegissor(johnLasseter);

        //OBLIG3 - Oppgave 5 & 7
        System.out.println();
        System.out.println("**************************");
        System.out.println("----------Filmer----------");
        System.out.println("**************************");

        //OBLIG3 - skriver ut info om filmene
        System.out.println(mammaMia.getTittel() + ": " + mammaMia.getBeskrivelse() + " - " + mammaMia.getRegissor().getFultNavn() +
                " - " + mammaMia.getUtgivelsesdato() + " : " + mammaMia.getSpilletid() + " min.");

        //OBLIG3
        System.out.println(hungerGames.getTittel() + ": " + hungerGames.getBeskrivelse() + " - " + hungerGames.getRegissor().getFultNavn() +
                " - " + hungerGames.getUtgivelsesdato() + " : " + hungerGames.getSpilletid() + " min.");
        //OBLIG3
        System.out.println(bilerFilmen.getTittel() + ": " + bilerFilmen.getBeskrivelse() + " - " + bilerFilmen.getRegissor().getFultNavn() +
                " - " + bilerFilmen.getUtgivelsesdato() + " : " + bilerFilmen.getSpilletid() + " min.");
        System.out.println("**************************");


        //OBLIG3 - Oppgave 8
        System.out.println();
        System.out.println("**************************");
        System.out.println("----------Roller----------");
        System.out.println("**************************");
        //OBLIG3 - Oppgave 8
        Rolle LynetMacQueen = new Rolle("Lynet", "Mac Queen");
        bilerFilmen.leggTilEnRolle(LynetMacQueen);
        System.out.println("Biler filmen: " + bilerFilmen.getRolleListe());

        //OBLIG3
        Person jennifer = new Person("Jennifer", "Lawrence");
        Rolle katniss = new Rolle("Katniss", "Everdeen", jennifer);
        Person josh = new Person("Josh", "Hutcherson");
        Rolle peeta = new Rolle("Peeta", "Mellark", josh);
        Person liam = new Person("Liam", "Hemsworth");
        Rolle gale = new Rolle("Gale", "Hawthorne", liam);

        //OBLIG3
        ArrayList<Rolle> roller = new ArrayList<>();
        roller.add(katniss);
        roller.add(peeta);
        roller.add(gale);
        hungerGames.leggTilMangeRoller(roller);

        //OBLIG3
        System.out.println("**************************");
        System.out.println("The Hunger Games cast: " + hungerGames.getRolleListe());
        System.out.println("**************************");
        System.out.println();

        //OBLIG3 - Oppgave 10
        //gameOfThrones.hentRollebesetning();


        //------------------------------------------------------------------------------------------------------------


        //OBLIG 4 - Oppgave 5

        //TV-SERIE
        TvSerie serie3 = new TvSerie("tittel3", "beskrivelse3",LocalDate.of(2019, 05, 13));

        ArrayList<TvSerie> serieListe = new ArrayList<>();
        serieListe.add(strangerThings);
        serieListe.add(gameOfThrones);
        serieListe.add(serie3);

        Collections.sort(serieListe);
        System.out.println(serieListe);

        //FILM
        LocalDate date4 = LocalDate.of(2019,10,16);
        Film film4 = new Film("Film4", "Beskrivelse4", date4, 110);


        ArrayList<Film> filmListe = new ArrayList<>();
        filmListe.add(mammaMia);
        filmListe.add(hungerGames);
        filmListe.add(bilerFilmen);
        filmListe.add(film4);

        Collections.sort(filmListe);
        System.out.println(filmListe);

        //EPISODE
        Episode episode10 = new Episode("tittel1", 10, 3, 98);
        Episode episode20 = new Episode("tittel2", 20, 4, 99);
        Episode episode30 = new Episode("tittel3", 30, 5, 100);

        ArrayList<Episode> episodeListe2 = new ArrayList<>();
        episodeListe2.add(episode1);
        episodeListe2.add(episode2);
        episodeListe2.add(episode3);

        Collections.sort(episodeListe2);
        System.out.println(episodeListe2);
    }
}

package no.hiof.torama.oblig3;


import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        TvSerie strangerThings = new TvSerie("Stranger Things",
                "When a young boy disappears, his mother, a police chief, and his friends must confront terrifying forces in order to get him back.",
                LocalDate.of(2016, 7,15));


        //tittel, episodeNummer, sesongNummer, beskrivelse, regissor, spilletid, utgivelsesdato
        LocalDate date = LocalDate.of(2016,07,15);
        Episode episode1 = new Episode("Chapter One: The Vanishing of Will Byers", 1, 1, "Spenning", 50, date);
        Episode episode2 = new Episode("Chapter Two: The Weirdo on Maple Street", 2, 1, "Spenning", 50, date);
        Episode episode3 = new Episode("Chapter Three: Holly, Jolly", 3, 1, "Spenning", 50, date);
        Episode episode4 = new Episode("Chapter Four: The Body", 4, 1, "Spenning", 50, date);


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

        ArrayList<Rolle> episodeRoller = new ArrayList<>();

        Person kitH = new Person("Kit", "Harington");
        Rolle jonS = new Rolle("Jon", "Snow", kitH); //Kit Harington
        episodeRoller.add(jonS);

        Person peterD = new Person("Peter", "Dinklage");
        Rolle tyrionL = new Rolle("Tyrion", "Lannister", peterD);
        episodeRoller.add(tyrionL);

        Person sophieT = new Person("Sophie", "Turner");
        Rolle sansaS = new Rolle("Sansa", "Stark", sophieT);
        episodeRoller.add(sansaS);

        for (int sesongNr = 1; sesongNr <= 5; sesongNr++) {
            for (int episodeNr = 1; episodeNr <= 5; episodeNr++) {
                Episode episodeRDM = new Episode("Generic Title", episodeNr, sesongNr, randomTallGenerator.nextInt(11) + 20);
                gameOfThrones.leggTilEpisode(episodeRDM);
                episodeRDM.leggTilMangeRoller(episodeRoller);
            }
        }

        ArrayList<Episode> gameOfThronesSesong4Episoder = gameOfThrones.hentEpisoderISesong(4);

        System.out.println("**************************");
        System.out.println("* " + gameOfThrones + " *");
        System.out.println("**************************");
        System.out.println("Gjennomsnittligspilletid: " + gameOfThrones.getGjennomSnittligSpilletid() + "min.");
        System.out.println("**************************");
        System.out.println("-------Episoder S04-------");

        for (Episode enEpisode : gameOfThronesSesong4Episoder) {
            System.out.println(enEpisode);
        }

        System.out.println("**************************");
        System.out.println();

        gameOfThrones.leggTilEpisode(new Episode("EpisodeISesong10", 1, 10, 50));



        //Oppgave 5
        LocalDate dateMM1 = LocalDate.of(2008,07,10);
        LocalDate dateHG = LocalDate.of(2012,03,23);
        LocalDate dateB = LocalDate.of(2006,10,26);

        //tittel, beskrivelse, utgivelsesdato, filmAar, spilletid
        Film mammaMia = new Film("Mamma Mia", "Musikal", dateMM1, 109);
        Film hungerGames = new Film("Hunger Games", "Action-science-fiction", dateHG, 114);
        Film bilerFilmen = new Film("Biler", "Barnefilm", dateB,117);

        //Oppave 7 - oppretter regissorer
        Person phyllidaLloyd = new Person("Phyllida","Lloyd");
        mammaMia.setRegissor(phyllidaLloyd);
        Person garyRoss = new Person("Gary","Ross");
        hungerGames.setRegissor(garyRoss);
        Person johnLasseter = new Person("John","Lasseter");
        bilerFilmen.setRegissor(johnLasseter);

        //Oppgave 5 & 7
        System.out.println();
        System.out.println("**************************");
        System.out.println("----------Filmer----------");
        System.out.println("**************************");

        //skriver ut info om filmene
        System.out.println(mammaMia.getTittel() + ": " + mammaMia.getBeskrivelse() + " - " + mammaMia.getRegissor().getFultNavn() +
                " - " + mammaMia.getUtgivelsesdato() + " : " + mammaMia.getSpilletid() + " min.");


        System.out.println(hungerGames.getTittel() + ": " + hungerGames.getBeskrivelse() + " - " + hungerGames.getRegissor().getFultNavn() +
                " - " + hungerGames.getUtgivelsesdato() + " : " + hungerGames.getSpilletid() + " min.");

        System.out.println(bilerFilmen.getTittel() + ": " + bilerFilmen.getBeskrivelse() + " - " + bilerFilmen.getRegissor().getFultNavn() +
                " - " + bilerFilmen.getUtgivelsesdato() + " : " + bilerFilmen.getSpilletid() + " min.");
        System.out.println("**************************");


        //Oppgave 8
        System.out.println();
        System.out.println("**************************");
        System.out.println("----------Roller----------");
        System.out.println("**************************");
        //Oppgave 8
        Rolle LynetMacQueen = new Rolle("Lynet", "Mac Queen");
        bilerFilmen.leggTilEnRolle(LynetMacQueen);
        System.out.println("Biler filmen: " + bilerFilmen.getRolleListe());

        Rolle katniss = new Rolle("Katniss", "Everdeen");
        Rolle peeta = new Rolle("Peeta", "Mellark");
        Rolle gale = new Rolle("Gale", "Hawthorne");

        ArrayList<Rolle> roller = new ArrayList<>();
        roller.add(katniss);
        roller.add(peeta);
        roller.add(gale);
        hungerGames.leggTilMangeRoller(roller);

        System.out.println("**************************");
        System.out.println("The Hunger Games cast: " + hungerGames.getRolleListe());
        System.out.println("**************************");


        System.out.println();

        //Oppgave 10
        gameOfThrones.hentRollebesetning();
    }
}

package no.hiof.torama.oblig4.data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import no.hiof.torama.oblig4.model.Film;

import java.time.LocalDate;
import java.util.Collections;

public class DataHandler {

    private final static ObservableList<Film> filmListe = FXCollections.observableArrayList();
    private final static ObservableList<String> filmTitler = FXCollections.observableArrayList();

    public static ObservableList<Film> hentFilmData(){
        if(filmListe.isEmpty()){

            LocalDate dateMM1 = LocalDate.of(2008,07,10);
            LocalDate dateHG = LocalDate.of(2012,03,23);
            LocalDate dateB = LocalDate.of(2006,10,26);

            Film mammaMia = new Film("Mamma Mia", "Musikal", dateMM1, 109);
            Film hungerGames = new Film("Hunger Games", "Action-science-fiction", dateHG, 114);
            Film bilerFilmen = new Film("Biler", "Barnefilm", dateB,117);

            filmListe.addAll(mammaMia, hungerGames, bilerFilmen);

        }

        Collections.sort(filmListe);

        return filmListe;
    }

    public static ObservableList<String> hentFilmTitler(){
        for(int i =0; i < filmListe.size(); i++){
            filmTitler.add(filmListe.get(i).getTittel());
        }

        return filmTitler;
    }

    public static void leggTilFilm(Film nyFilm){
        filmListe.add(nyFilm);
    }

    public static void slettFilm(int filmRemember){
        filmListe.remove(filmRemember);
    }

}

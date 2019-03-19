package no.hiof.torama.oblig4.controller;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import no.hiof.torama.oblig4.MainJavaFX;
import no.hiof.torama.oblig4.data.DataHandler;
import no.hiof.torama.oblig4.model.Film;

import javafx.event.ActionEvent;

public class FilmController {
    @FXML
    private ListView<Film> filmList;

    private static int filmRemember;

    @FXML
    private Label filmTittel;

    @FXML
    private TextArea filmBeskrivelse;

    @FXML
    private TextField filmUtgivelsesdato;

    @FXML
    private TextField filmSpilletid;

    @FXML
    public void initialize() {
        filmList.setItems(DataHandler.hentFilmData());

        filmList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Film>() {

            @Override

            public void changed(ObservableValue<? extends Film> observableValue, Film forrigeFilm, Film nyFilm) {

                filmTittel.setText(nyFilm.getTittel());
                filmBeskrivelse.setText(nyFilm.getBeskrivelse());
                filmUtgivelsesdato.setText(String.valueOf(nyFilm.getUtgivelsesdato()));
                filmSpilletid.setText(String.valueOf(nyFilm.getSpilletid()));
                filmRemember = filmList.getSelectionModel().getSelectedIndex();
                System.out.println(filmRemember);
            }
        });

        filmList.getSelectionModel().select(0);
    }

    public void redigerFilm(ActionEvent actionEvent) {
/* Faar ikke dette til aa fungere, derfor legger jeg det i en egen klasse lenger ned i denne filen.

        RedigerController r = new RedigerController(){

            public void rediger(){
                MainJavaFX minApplikasjon = MainJavaFX.getInstance();

                minApplikasjon.gaaTilRedigerVisning();
            }
        };
*/
        AnonymousClass.rediger();
    }

    public void nyFilm(ActionEvent actionEvent) {
        AnonymousClass.ny();
    }

    public void slettFilm(ActionEvent actionEvent) {
        AnonymousClass.slett();
    }


    public static int getFilmRemember() {
        return filmRemember;
    }
}

class AnonymousClass{

    static void rediger(){
        MainJavaFX minApplikasjon = MainJavaFX.getInstance();

        minApplikasjon.gaaTilRedigerVisning();
    }

    static void ny(){
        MainJavaFX minApplikasjon = MainJavaFX.getInstance();

        minApplikasjon.gaaTilNy();
    }

    static void slett(){
        DataHandler.slettFilm(FilmController.getFilmRemember());
    }
}
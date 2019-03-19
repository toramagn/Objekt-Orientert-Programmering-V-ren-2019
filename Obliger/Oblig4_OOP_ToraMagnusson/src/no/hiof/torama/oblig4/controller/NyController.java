package no.hiof.torama.oblig4.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import no.hiof.torama.oblig4.MainJavaFX;
import no.hiof.torama.oblig4.data.DataHandler;
import no.hiof.torama.oblig4.model.Film;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class NyController {

    @FXML
    private TextField nyFilmTittel;

    @FXML
    private TextArea nyFilmBeskrivelse;

    @FXML
    private DatePicker nyFilmUtgivelsesdato;

    @FXML
    private TextField nyFilmSpilletid;


    public void filmNy(ActionEvent actionEvent) {

        String FilmTittel = nyFilmTittel.getText();
        String FilmBeskrivelse = nyFilmBeskrivelse.getText();
        LocalDate FilmUtgivelsesdato = nyFilmUtgivelsesdato.getValue();
        double FilmSpilletid = Integer.valueOf(nyFilmSpilletid.getText());

        Film nyFilm = new Film(FilmTittel, FilmBeskrivelse, FilmUtgivelsesdato, FilmSpilletid);

        DataHandler.leggTilFim(nyFilm);

        MainJavaFX minApplikasjon = MainJavaFX.getInstance();

        minApplikasjon.gaaTilHovedVisning();
    }

    public void cancel(){
        MainJavaFX minApplikasjon = MainJavaFX.getInstance();

        minApplikasjon.gaaTilHovedVisning();
    }
}
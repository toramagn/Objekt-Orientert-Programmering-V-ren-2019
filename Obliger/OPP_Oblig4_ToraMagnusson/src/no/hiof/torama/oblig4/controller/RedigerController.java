package no.hiof.torama.oblig4.controller;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import no.hiof.torama.oblig4.MainJavaFX;
import no.hiof.torama.oblig4.data.DataHandler;
import no.hiof.torama.oblig4.model.Film;

import java.awt.*;
import javafx.event.ActionEvent;
import java.time.LocalDate;


public class RedigerController {

    private int filmRemember = FilmController.getFilmRemember();

    private Film film;

    @FXML
    private TextField filmTitle;

    @FXML
    private TextArea filmBeskrivelse;

    @FXML
    private DatePicker filmUtgivelsesdato;

    @FXML
    private TextField filmSpilletid;

    @FXML
    public void initialize(){
        film = DataHandler.hentFilmData().get(filmRemember);

        filmTitle.setText(film.getTittel());
        filmBeskrivelse.setText(film.getBeskrivelse());
        filmUtgivelsesdato.setValue(film.getUtgivelsesdato());
        filmSpilletid.setText(String.valueOf(film.getSpilletid()));
    }

    public void filmRediger(ActionEvent actionEvent){

        String tittelRediger = filmTitle.getText();
        String beskrivelseRediger = filmBeskrivelse.getText();
        LocalDate utgivelsesdatoRediger = filmUtgivelsesdato.getValue();
        double spilletidRediger = Double.valueOf(filmSpilletid.getText());

        System.out.println(tittelRediger);
        System.out.println(beskrivelseRediger);
        System.out.println(utgivelsesdatoRediger);
        System.out.println(spilletidRediger);

        film.setTittel(tittelRediger);
        film.setBeskrivelse(beskrivelseRediger);
        film.setUtgivelsesdato(utgivelsesdatoRediger);
        film.setSpilletid((int) spilletidRediger);


        MainJavaFX minApplikasjon = MainJavaFX.getInstance();

        minApplikasjon.gaaTilHovedVisning();

    }

    public void cancel(){
        MainJavaFX minApplikasjon = MainJavaFX.getInstance();

        minApplikasjon.gaaTilHovedVisning();
    }
}

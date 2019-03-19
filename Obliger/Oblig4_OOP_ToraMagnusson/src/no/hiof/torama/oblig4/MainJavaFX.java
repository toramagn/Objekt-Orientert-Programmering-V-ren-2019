package no.hiof.torama.oblig4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;

import java.awt.event.ActionEvent;
import java.beans.EventHandler;
import java.io.IOException;

public class MainJavaFX extends Application {
    private Stage primaryStage;
    private static MainJavaFX minApplikasjon;

    public MainJavaFX() {
        minApplikasjon = this;
    }


    @Override
    public void start(Stage primaryStage) {

        this.primaryStage = primaryStage;

        gaaTilHovedVisning();
    }

    public void gaaTilHovedVisning(){
        try {
            FXMLLoader fxmlInnlaster = new FXMLLoader();
            fxmlInnlaster.setLocation(getClass().getResource("view/Filmer.fxml"));
            Parent hovedLayout = fxmlInnlaster.load();

            Scene hovedScene = new Scene(hovedLayout, 600, 400);

            primaryStage.setScene(hovedScene);
            primaryStage.setTitle("Filmer");
            primaryStage.show();
        }
        catch (IOException ioe) {
            visAlertFeilmelding("I/O feil: ", ioe.getMessage());
        }
    }

    public void gaaTilRedigerVisning(){
        try {
            FXMLLoader fxmlInnlaster = new FXMLLoader();
            fxmlInnlaster.setLocation(getClass().getResource("view/Rediger.fxml"));
            Parent hovedLayout = fxmlInnlaster.load();

            Scene hovedScene = new Scene(hovedLayout, 600, 400);

            primaryStage.setScene(hovedScene);
            primaryStage.setTitle("Rediger");
        }
        catch (IOException ioe) {
            visAlertFeilmelding("I/O feil: ", ioe.getMessage());
        }
    }

    public void gaaTilNy(){
        try{
            FXMLLoader fxmlInnlaster = new FXMLLoader();
            fxmlInnlaster.setLocation(getClass().getResource("view/NyFilm.fxml"));
            Parent hovedLayout = fxmlInnlaster.load();

            Scene hovedScene = new Scene(hovedLayout,600,400);

            primaryStage.setScene(hovedScene);
            primaryStage.setTitle("Ny Film");
        }
        catch (IOException ioexc){
            System.out.println(ioexc.getMessage());
        }

    }


    private void visAlertFeilmelding(String overskrift, String melding) {
        Alert exceptionAlert = new Alert(Alert.AlertType.ERROR);
        exceptionAlert.setTitle("Feil");
        exceptionAlert.setHeaderText(overskrift);
        exceptionAlert.setContentText(melding);

        exceptionAlert.showAndWait();
    }



    public static MainJavaFX getInstance() {
        return minApplikasjon;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
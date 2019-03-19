package no.hiof.torama.oblig4.model;


import java.time.LocalDate;
import java.util.ArrayList;


//OBLIG4 - Oppgave4 - gjør klassen abstrakt
public abstract class Produksjon{
    //OBLIG3 - Oppgave 4
    private String tittel;
    private double spilletid;
    //OBLIG3 - Oppgave 6
    private LocalDate utgivelsesdato;
    private String beskrivelse;
    //OBLIG3 - Oppgave 7
    private Person regissor;
    //OBLIG3 - Oppgave 8
    private ArrayList<Rolle> rolleListe = new ArrayList<>();
    private Rolle rolle;

    public Produksjon(String tittel, double spilletid){
        this.tittel = tittel;
        this.spilletid = spilletid;
    }

    //OBLIG3 - Konstruktoor - Oppgave 4 & 6
    public Produksjon(String tittel, double spilletid, String beskrivelse, LocalDate utgivelsesdato) {
        this.tittel = tittel;
        this.spilletid = spilletid;
        this.beskrivelse = beskrivelse;
        this.utgivelsesdato = utgivelsesdato;
    }

    //OBLIG3 - Oppgave 4
    public String getTittel() {
        return tittel;
    }
    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    //OBLIG 3
    public double getSpilletid() {
        return spilletid;
    }
    public void setSpilletid(double spilletid) {
        this.spilletid = spilletid;
    }

    //OBLIG3 - Oppgave 6
    public LocalDate getUtgivelsesdato() {
        return utgivelsesdato;
    }
    public void setUtgivelsesdato(LocalDate utgivelsesdato) {
        this.utgivelsesdato = utgivelsesdato;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }
    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    //OBLIG3 - Oppgave 7
    public Person getRegissor() {
        return regissor;
    }
    public void setRegissor(Person regissor) {
        this.regissor = regissor;
    }

    //OBLIG3 - Oppgave 8
    public ArrayList<Rolle> getRolleListe() {
        return rolleListe;
    }
    public Rolle getRolle() {
        return rolle;
    }
    public void setRolle(Rolle rolle) {
        this.rolle = rolle;
    }

    //OBLIG3 - Oppgave 8
    public void leggTilEnRolle(Rolle enRolle) {
        rolleListe.add(enRolle);
    }
    public void leggTilMangeRoller(ArrayList<Rolle> flereRoller) {
        rolleListe.addAll(flereRoller);
    }

    //OBLIG3 - Oppgave 9
    @Override
    public String toString(){
        return "Produksjon:" + tittel + " - " + utgivelsesdato + " - " + regissor + " - " + spilletid;
    }
}
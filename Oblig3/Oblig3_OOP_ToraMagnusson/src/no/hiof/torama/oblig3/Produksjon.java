package no.hiof.torama.oblig3;


import java.time.LocalDate;
import java.util.ArrayList;


public class Produksjon{
    //Oppgave 4
    private String tittel;
    private int spilletid;
    //Oppgave 6
    private LocalDate utgivelsesdato;
    private String beskrivelse;
    //Oppgave 7
    private Person regissor;
    //Oppgave 8
    private ArrayList<Rolle> rolleListe = new ArrayList<>();
    private Rolle rolle;

    public Produksjon(String tittel, int spilletid){
        this.tittel = tittel;
        this.spilletid = spilletid;
    }

    //Konstruktoor - Oppgave 4 & 6
    public Produksjon(String tittel, int spilletid, String beskrivelse, LocalDate utgivelsesdato) {
        this.tittel = tittel;
        this.spilletid = spilletid;
        this.beskrivelse = beskrivelse;
        this.utgivelsesdato = utgivelsesdato;
    }

    //Oppgave 4
    public String getTittel() {
        return tittel;
    }
    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public int getSpilletid() {
        return spilletid;
    }
    public void setSpilletid(int spilletid) {
        this.spilletid = spilletid;
    }

    //Oppgave 6
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

    //Oppgave 7
    public Person getRegissor() {
        return regissor;
    }
    public void setRegissor(Person regissor) {
        this.regissor = regissor;
    }

    //Oppgave 8
    public ArrayList<Rolle> getRolleListe() {
        return rolleListe;
    }
    public Rolle getRolle() {
        return rolle;
    }
    public void setRolle(Rolle rolle) {
        this.rolle = rolle;
    }

    //Oppgave 8
    public void leggTilEnRolle(Rolle enRolle) {
        rolleListe.add(enRolle);
    }
    public void leggTilMangeRoller(ArrayList<Rolle> flereRoller) {
        rolleListe.addAll(flereRoller);
    }

    //Oppgave 9
    @Override
    public String toString(){
        return "Produksjon:" + tittel + " - " + utgivelsesdato + " - " + regissor + " - " + spilletid;
    }
}
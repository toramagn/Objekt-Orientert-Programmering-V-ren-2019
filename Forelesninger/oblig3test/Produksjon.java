package no.hiof.torama.movietime;

import java.time.LocalDate;


public class Produksjon{
    //Oppgave 4
    private String tittel;
    private int spilletid;
    //Oppgave 6
    private LocalDate utgivelsesdato;
    private String beskrivelse;

    //Oppgave 7
    private Person regissor;

    public Produksjon(){

    }

    //Konstruktoor - Oppgave 4 & 6
    public Produksjon(String tittel, int spilletid, String beskrivelse, LocalDate utgivelsesdato) {
        this.tittel = tittel;
        this.spilletid = spilletid;
        this.beskrivelse = beskrivelse;
        this.utgivelsesdato = spilletutgivelsesdatoid;
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
}
package no.hiof.torama.oblig4.model;


import java.time.LocalDate;

public class Film extends Produksjon implements Comparable<Film>{

    //OBLIG3 - Oppgave 5
    public Film(String tittel, String beskrivelse, LocalDate utgivelsesdato, double spilletid) {
        // Kaller konstruktooren til super-klassen Produksjon
        super(tittel, spilletid, beskrivelse, utgivelsesdato);
    }

    //OBLIG3 - Oppgave 9
    @Override
    public String toString(){
        return super.getTittel() + " (" + super.getUtgivelsesdato() + ")";
    }

    @Override
    public int compareTo(Film other){
        return this.getTittel().compareTo(other.getTittel());
    }

}
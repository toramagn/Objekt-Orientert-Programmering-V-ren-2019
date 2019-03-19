package no.hiof.torama.oblig3;


import java.time.LocalDate;

public class Film extends Produksjon{

    //Oppgave 5
    public Film(String tittel, String beskrivelse, LocalDate utgivelsesdato, int spilletid) {
        // Kaller konstruktooren til super-klassen Produksjon
        super(tittel, spilletid, beskrivelse, utgivelsesdato);
    }

    //Oppgave 9
    @Override
    public String toString(){
        return "Film: " + super.getTittel() + " - " + super.getUtgivelsesdato() + " - " + super.getRegissor() + " - " + super.getSpilletid();
    }

}
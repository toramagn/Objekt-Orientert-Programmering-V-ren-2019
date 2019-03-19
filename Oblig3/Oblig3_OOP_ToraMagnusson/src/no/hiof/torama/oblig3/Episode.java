package no.hiof.torama.oblig3;

import java.time.LocalDate;


public class Episode extends Produksjon {
    private int episodeNummer, sesongNummer;

    public Episode(String tittel, int episodeNummer, int sesongNummer, int spilletid) {
        super(tittel, spilletid);
        this.episodeNummer = episodeNummer;
        this.sesongNummer = sesongNummer;
    }

    public Episode(String tittel, int episodeNummer, int sesongNummer, String beskrivelse, int spilletid, LocalDate utgivelsesdato) {
        //Oppgave 4
        // Kaller konstruktooren til super-klassen Produksjon
        super(tittel, spilletid, beskrivelse, utgivelsesdato);
        this.episodeNummer = episodeNummer;
        this.sesongNummer = sesongNummer;
    }

    public int getEpisodeNummer() {
        return episodeNummer;
    }

    public void setEpisodeNummer(int episodeNummer) {
        this.episodeNummer = episodeNummer;
    }

    public int getSesongNummer() {
        return sesongNummer;
    }

    public void setSesongNummer(int sesongNummer) {
        this.sesongNummer = sesongNummer;
    }


    //Oppgave 9
    @Override
    public String toString() {
        return "Episode: S" + String.format("%02d", sesongNummer) + "E" + String.format("%02d", episodeNummer) + " - " + super.getTittel();
    }
}
